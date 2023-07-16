package X;

import android.content.Context;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.mmapbuf.core.Buffer;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: X.0dB  reason: invalid class name and case insensitive filesystem */
public final class C08330dB extends AnonymousClass4TI {
    public final boolean A00;

    public final void A03() {
        File[] listFiles;
        ArrayList arrayList;
        Buffer buffer;
        TreeSet treeSet;
        if (this.A00 && C08000cZ.A0A.get() != null) {
            synchronized (AnonymousClass0UI.class) {
                if (AnonymousClass0UI.A01 && (treeSet = AnonymousClass0UI.A00) != null) {
                    Iterator it = treeSet.iterator();
                    while (it.hasNext()) {
                        AnonymousClass0UH r0 = (AnonymousClass0UH) it.next();
                        AnonymousClass0UI.A00((Context) null, r0.A00, r0.A01, r0.A02);
                    }
                    treeSet.clear();
                }
            }
            C08000cZ A002 = C08000cZ.A00();
            C05680Uw r2 = C05680Uw.A0A;
            File file = A002.A01.A04;
            try {
                if (file.isDirectory() && file.exists() && (listFiles = file.listFiles()) != null) {
                    if (r2 == null) {
                        arrayList = Collections.emptyList();
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (TraceContext traceContext : r2.A06()) {
                            if (!((traceContext.A03 & 2) == 0 || (buffer = traceContext.A09) == null)) {
                                String filePath = buffer.getFilePath();
                                if (filePath != null) {
                                    arrayList2.add(filePath);
                                }
                                String memoryMappingFilePath = buffer.getMemoryMappingFilePath();
                                if (memoryMappingFilePath != null) {
                                    arrayList2.add(memoryMappingFilePath);
                                }
                            }
                        }
                        arrayList = arrayList2;
                    }
                    for (File file2 : listFiles) {
                        if (!arrayList.contains(file2.getCanonicalPath())) {
                            synchronized (AnonymousClass0VO.A01) {
                                if (file2.exists()) {
                                    file2.delete();
                                }
                            }
                        }
                    }
                }
            } catch (IOException e) {
                AnonymousClass0LU.A0E("Profilo/MmapProcessing", "Exception during mmap file cleanup", e);
            }
        }
    }

    public C08330dB(boolean z) {
        this.A00 = z;
    }
}
