package X;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import com.facebook.common.dextricks.DalvikInternals;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.CRC32;

/* renamed from: X.3Ut  reason: invalid class name and case insensitive filesystem */
public final class C61663Ut {
    public static final AtomicBoolean A07 = new AtomicBoolean();
    public final Method A00;
    public final MappedByteBuffer A01;
    public final AtomicBoolean A02 = new AtomicBoolean();
    public final Resources A03;
    public final C18750xp A04;
    public final Constructor A05;
    public final Method A06;

    public final synchronized XmlResourceParser A00(int i) {
        XmlResourceParser xmlResourceParser;
        Throwable th;
        String string = this.A03.getString(i);
        if (!string.startsWith("L|")) {
            xmlResourceParser = null;
        } else {
            String[] split = string.split("\\|");
            if (split.length == 4) {
                int parseInt = Integer.parseInt(split[1], 16);
                int parseInt2 = Integer.parseInt(split[2], 16);
                C18750xp r5 = this.A04;
                Object obj = r5.get(Long.valueOf(((long) parseInt2) | (((long) parseInt) << 32)));
                if (obj == null) {
                    try {
                        byte[] bArr = new byte[parseInt2];
                        if (A07.get()) {
                            MappedByteBuffer mappedByteBuffer = this.A01;
                            mappedByteBuffer.position(parseInt);
                            mappedByteBuffer.get(bArr);
                        } else {
                            for (int i2 = 0; i2 < parseInt2; i2++) {
                                bArr[i2] = this.A01.get(parseInt + i2);
                            }
                        }
                        long parseLong = Long.parseLong(split[3], 16);
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArr);
                        if (parseLong == (crc32.getValue() & 65535)) {
                            try {
                                obj = this.A05.newInstance(new Object[]{bArr});
                                r5.put(Long.valueOf(((long) parseInt2) | (((long) parseInt) << 32)), obj);
                            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                                th = new RuntimeException(AnonymousClass00U.A0L("Could not create XmlBlock for bundled layout 0x", Integer.toHexString(i)), e);
                            }
                        } else {
                            th = new IOException(AnonymousClass00U.A0L("CRC mismatch loading layout 0x", Integer.toHexString(i)));
                        }
                    } catch (IndexOutOfBoundsException e2) {
                        th = new IOException(AnonymousClass00U.A0L("Detected truncated layouts.bin loading 0x", Integer.toHexString(i)), e2);
                    }
                }
                try {
                    xmlResourceParser = (XmlResourceParser) this.A06.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException e3) {
                    th = new RuntimeException(AnonymousClass00U.A0L("Could not create XmlResourceParser for bundled layout 0x", Integer.toHexString(i)), e3);
                }
            } else {
                th = C18250wR.A0V(AnonymousClass00U.A0d("Bad bundled layout token \"", string, "\" for resourceID 0x", Integer.toHexString(i)));
            }
            throw th;
        }
        return xmlResourceParser;
    }

    public C61663Ut(Resources resources, File file) {
        this.A03 = resources;
        this.A04 = new C18750xp(this);
        FileChannel channel = new FileInputStream(file).getChannel();
        this.A01 = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
        DalvikInternals.madviseFile(file.getCanonicalPath());
        try {
            Class<?> cls = Class.forName("android.content.res.XmlBlock");
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[]{byte[].class});
            this.A05 = declaredConstructor;
            Method declaredMethod = cls.getDeclaredMethod("newParser", new Class[0]);
            this.A06 = declaredMethod;
            Method declaredMethod2 = cls.getDeclaredMethod("close", new Class[0]);
            this.A00 = declaredMethod2;
            declaredConstructor.setAccessible(true);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            throw new RuntimeException("Unable to load XmlBlock methods by reflection", e);
        }
    }
}
