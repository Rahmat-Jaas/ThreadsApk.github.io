package com.facebook.superpack;

import X.AnonymousClass00U;
import X.C14990qW;
import X.C15080qg;
import X.C15210qv;
import com.facebook.breakpad.BreakpadManager;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SuperpackFileLoader implements C15080qg {
    public static final String[] COMPRESSION_EXTENSIONS = {".lz4", ".zst", ".xz", ".zstd", ".br", ".spo"};
    public static final Set HOLDOUT_LIBRARIES = new HashSet(Arrays.asList(new String[]{"libliger.so"}));
    public static final String[] SIGMUX_LIB = {"libdistractmerged.so", "libsigmux.so"};
    public static final String[] SIGMUX_SOLOADER_LIB = {"distractmerged", "sigmux"};
    public static boolean sLoadedSuperpack;
    public static final Map sPendingMappings = Collections.synchronizedMap(new HashMap());
    public final Runtime mRuntime = Runtime.getRuntime();

    public static native boolean canLoadInMemoryNative();

    public static native MappingInfo[] loadBytesNative(String str, byte[] bArr);

    public static native MappingInfo[] loadFdNative(String str, int i, long j, long j2);

    public static native void loadFileNative(String str);

    public class MappingInfo {
        public final byte[] buildId;
        public final long fileOffset;
        public final long mappingSize;
        public final String name;
        public final long startAddress;

        public MappingInfo(String str, byte[] bArr, long j, long j2, long j3) {
            this.name = str;
            this.buildId = bArr;
            this.startAddress = j;
            this.mappingSize = j2;
            this.fileOffset = j3;
        }
    }

    private void ensureMappingsRegistered() {
        if (BreakpadManager.mNativeLibraryName != null) {
            Map map = sPendingMappings;
            if (!map.isEmpty()) {
                ArrayList arrayList = new ArrayList(map.size());
                synchronized (map) {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add((MappingInfo) ((Map.Entry) it.next()).getValue());
                        it.remove();
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    MappingInfo mappingInfo = (MappingInfo) it2.next();
                    String str = mappingInfo.name;
                    byte[] bArr = mappingInfo.buildId;
                    BreakpadManager.addMappingInfo(str, bArr, bArr.length, mappingInfo.startAddress, mappingInfo.mappingSize, mappingInfo.fileOffset);
                }
            }
        }
    }

    public void load(String str, int i) {
        if (sLoadedSuperpack) {
            try {
                loadFileNative(str);
            } catch (UnsatisfiedLinkError e) {
                if (!(!str.endsWith(".so"))) {
                    System.load(str);
                } else {
                    throw e;
                }
            }
            ensureMappingsRegistered();
            return;
        }
        System.load(str);
        if (str.regionMatches(str.lastIndexOf(File.separatorChar) + 1, "libsuperpack-jni.so", 0, 19)) {
            sLoadedSuperpack = true;
        }
    }

    public void loadBytes(String str, C15210qv r18, int i) {
        String str2 = str;
        C15210qv r3 = r18;
        try {
            ByteBuffer allocate = ByteBuffer.allocate((int) r3.size());
            r3.read(allocate);
            MappingInfo[] loadBytesNative = loadBytesNative(str2, allocate.array());
            if (loadBytesNative != null) {
                for (MappingInfo mappingInfo : loadBytesNative) {
                    if (BreakpadManager.mNativeLibraryName != null) {
                        String str3 = mappingInfo.name;
                        byte[] bArr = mappingInfo.buildId;
                        BreakpadManager.addMappingInfo(str3, bArr, bArr.length, mappingInfo.startAddress, mappingInfo.mappingSize, mappingInfo.fileOffset);
                    } else {
                        sPendingMappings.put(Long.valueOf(mappingInfo.startAddress), mappingInfo);
                    }
                }
            }
            ensureMappingsRegistered();
        } catch (IOException unused) {
            throw new RuntimeException(AnonymousClass00U.A0V("Failed to load ", str2, ": Could not read file"));
        }
    }

    public SuperpackFileLoader() {
        C14990qW.A01();
    }
}
