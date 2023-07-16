package X;

import android.content.Context;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.mmapbuf.reader.MmapBufferHeaderReader;
import com.facebook.profilo.mmapbuf.writer.MmapBufferTraceWriter;
import java.io.File;
import java.io.IOException;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0UI  reason: invalid class name */
public final class AnonymousClass0UI {
    public static TreeSet A00;
    public static volatile boolean A01;

    public static String A00(Context context, String str, String str2, String... strArr) {
        boolean add;
        File A012;
        long readTraceId;
        String[] strArr2 = strArr;
        if (A01) {
            AtomicReference atomicReference = C08000cZ.A0A;
            boolean z = false;
            if (atomicReference.get() != null) {
                z = true;
            }
            String str3 = str;
            String str4 = str2;
            if (z && C05680Uw.A0A != null) {
                File A013 = new AnonymousClass0VO(C08000cZ.A00().A01.A04).A01(str3);
                if (A013 == null) {
                    return null;
                }
                boolean z2 = false;
                if (atomicReference.get() != null) {
                    z2 = true;
                }
                if (!z2) {
                    return null;
                }
                A013.getName();
                C08000cZ A002 = C08000cZ.A00();
                C05680Uw r9 = C05680Uw.A0A;
                if (r9 != null) {
                    try {
                        for (TraceContext traceContext : r9.A06()) {
                            Buffer buffer = traceContext.A09;
                            if (buffer != null && A013.getCanonicalPath().equals(buffer.getMemoryMappingFilePath())) {
                                synchronized (AnonymousClass0VO.A01) {
                                    A013.delete();
                                }
                                return null;
                            }
                        }
                    } catch (IOException e) {
                        AnonymousClass0LU.A0E("Profilo/MmapProcessing", "Processing failed due to I/O issues.", e);
                        synchronized (AnonymousClass0VO.A01) {
                            A013.delete();
                            return null;
                        }
                    } catch (Exception e2) {
                        try {
                            AnonymousClass0LU.A0I("Profilo/MmapProcessing", "Exception while processing a file-backed buffer.", e2);
                            synchronized (AnonymousClass0VO.A01) {
                                A013.delete();
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            synchronized (AnonymousClass0VO.A01) {
                                try {
                                    A013.delete();
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                throw th;
                            }
                        }
                    }
                }
                Object obj = AnonymousClass0VO.A01;
                synchronized (obj) {
                    MmapBufferTraceWriter mmapBufferTraceWriter = new MmapBufferTraceWriter();
                    long nativeInitAndVerify = mmapBufferTraceWriter.nativeInitAndVerify(A013.getCanonicalPath());
                    if (nativeInitAndVerify == 0) {
                        synchronized (obj) {
                            A013.delete();
                        }
                        return null;
                    }
                    String A003 = AnonymousClass0QJ.A00(nativeInitAndVerify);
                    TraceContext traceContext2 = new TraceContext();
                    traceContext2.A06 = nativeInitAndVerify;
                    File file = new File(r9.A03, A003.replace("+", "_p_").replace("/", "_s_"));
                    traceContext2.A0A = file;
                    traceContext2.A0F = new Buffer[0];
                    traceContext2.A03 = 2;
                    String canonicalPath = file.getCanonicalPath();
                    C08070cg r0 = new C08070cg(traceContext2, A002);
                    if (strArr == null) {
                        strArr2 = new String[0];
                    }
                    mmapBufferTraceWriter.nativeWriteTrace(str4, true, canonicalPath, "main", 2, r0, strArr2);
                    synchronized (obj) {
                        A013.delete();
                    }
                    return A003;
                }
            } else if (context != null) {
                synchronized (AnonymousClass0UI.class) {
                    TreeSet treeSet = A00;
                    if (treeSet == null) {
                        treeSet = new TreeSet();
                        A00 = treeSet;
                    }
                    add = treeSet.add(new AnonymousClass0UH(str3, str4, strArr2));
                }
                if (add) {
                    File file2 = new File(new File(context.getFilesDir(), "profilo"), "mmap_buffer");
                    if (!file2.exists()) {
                        file2 = null;
                    }
                    if (file2 == null || (A012 = new AnonymousClass0VO(file2).A01(str3)) == null) {
                        return null;
                    }
                    MmapBufferHeaderReader mmapBufferHeaderReader = new MmapBufferHeaderReader();
                    synchronized (AnonymousClass0VO.A01) {
                        readTraceId = mmapBufferHeaderReader.readTraceId(A012.getAbsolutePath());
                    }
                    if (readTraceId != 0) {
                        return AnonymousClass0QJ.A00(readTraceId);
                    }
                    return null;
                }
            }
        }
        return null;
    }
}
