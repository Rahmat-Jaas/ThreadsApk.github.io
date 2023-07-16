package X;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.mmapbuf.core.MmapBufferManager;
import com.facebook.redex.IDxComparatorShape301S0100000_I2;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0cZ  reason: invalid class name and case insensitive filesystem */
public final class C08000cZ implements AnonymousClass0V4, C05600Uj {
    public static AtomicReference A0A = new AtomicReference((Object) null);
    public AnonymousClass0UL A00;
    public AnonymousClass0VF A01;
    public MmapBufferManager A02;
    public C09020eh A03;
    public AnonymousClass0Uk[] A04;
    public AnonymousClass0Uk[] A05;
    public final AnonymousClass0JN A06;
    public final Object A07 = new Object();
    public final Random A08;
    public volatile AnonymousClass0UJ A09;

    public C08000cZ(Context context, AnonymousClass0UL r8, AnonymousClass0Uk[] r9) {
        this.A00 = r8;
        this.A09 = null;
        this.A01 = new AnonymousClass0VF(context);
        this.A03 = null;
        this.A08 = new Random();
        this.A06 = new AnonymousClass0JN();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AnonymousClass0Uk r1 : r9) {
            if (r1.A07()) {
                arrayList.add(r1);
            } else {
                arrayList2.add(r1);
            }
        }
        this.A04 = (AnonymousClass0Uk[]) arrayList2.toArray(new AnonymousClass0Uk[arrayList2.size()]);
        this.A05 = (AnonymousClass0Uk[]) arrayList.toArray(new AnonymousClass0Uk[arrayList.size()]);
    }

    public final void A05() {
        C09020eh r3;
        List asList;
        List asList2;
        synchronized (this) {
            r3 = this.A03;
        }
        if (r3 != null) {
            AnonymousClass0VF r5 = this.A01;
            File file = r5.A05;
            File file2 = r5.A06;
            long j = r5.A01;
            FilenameFilter filenameFilter = AnonymousClass0VF.A07;
            AnonymousClass0VF.A01(r5, file, file2, new FilenameFilter[]{filenameFilter}, j);
            File[] listFiles = file.listFiles(filenameFilter);
            if (listFiles == null) {
                asList = Collections.EMPTY_LIST;
            } else {
                asList = Arrays.asList(listFiles);
            }
            Collections.sort(asList, new IDxComparatorShape301S0100000_I2(r5, 1));
            long j2 = r5.A01;
            FilenameFilter filenameFilter2 = AnonymousClass0VF.A08;
            AnonymousClass0VF.A01(r5, file, file2, new FilenameFilter[]{filenameFilter2}, j2);
            File[] listFiles2 = file.listFiles(filenameFilter2);
            if (listFiles2 == null) {
                asList2 = Collections.EMPTY_LIST;
            } else {
                asList2 = Arrays.asList(listFiles2);
            }
            Collections.sort(asList2, new IDxComparatorShape301S0100000_I2(r5, 2));
            C09020eh.A00(this, r3, asList2);
            C09020eh.A00(this, r3, asList);
        }
    }

    public final void A06(AnonymousClass0UL r4) {
        synchronized (this) {
            if (!r4.equals(this.A00)) {
                AnonymousClass0JN r1 = this.A06;
                r1.C8y();
                synchronized (this) {
                    this.A00 = r4;
                    A01(r4.Ak0(), this);
                }
                r1.BrS();
            }
        }
    }

    public final synchronized void A07(C08010ca r2) {
        this.A06.A00.remove(r2);
    }

    public final synchronized void A08(C09020eh r3) {
        synchronized (this) {
            if (this.A03 != r3) {
                this.A03 = r3;
                A05();
            }
        }
    }

    public final void CRw(File file) {
        synchronized (this) {
            AnonymousClass0VF r4 = this.A01;
            File file2 = r4.A06;
            if (AnonymousClass0VF.A03(r4, file, new File(file2, file.getName()))) {
                AnonymousClass0VF.A02(r4, file2, new FilenameFilter[]{AnonymousClass0VF.A07, AnonymousClass0VF.A08}, r4.A00);
            }
        }
        this.A06.CRw(file);
    }

    public static C08000cZ A00() {
        C08000cZ r0 = (C08000cZ) A0A.get();
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("TraceOrchestrator has not been initialized");
    }

    public static void A01(AnonymousClass0UJ r2, C08000cZ r3) {
        if (!r2.equals(r3.A09)) {
            r3.A09 = r2;
            C05680Uw r0 = C05680Uw.A0A;
            if (r0 != null) {
                AtomicReference atomicReference = r0.A05;
                atomicReference.compareAndSet(atomicReference.get(), r2);
                return;
            }
            throw new IllegalStateException("Performing config change before TraceControl has been initialized");
        }
    }

    private void A02(TraceContext traceContext) {
        for (Buffer deallocateBuffer : traceContext.A0F) {
            if (!this.A02.deallocateBuffer(deallocateBuffer)) {
                Log.e("Profilo/TraceOrchestrator", AnonymousClass00U.A0L("Could not release memory for buffer for trace: ", traceContext.A0D));
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0059 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x005e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03(com.facebook.profilo.ipc.TraceContext r8) {
        /*
            r7 = this;
            java.io.File r2 = r8.A0A
            boolean r0 = r2.isDirectory()
            r1 = 1
            if (r0 == 0) goto L_0x0030
            java.lang.String[] r0 = r2.list()
            int r0 = r0.length
            if (r0 <= r1) goto L_0x0030
        L_0x0010:
            r4 = 0
            java.io.File r6 = r8.A0A
            if (r1 == 0) goto L_0x0063
            java.lang.String r1 = ".zip.tmp"
            boolean r0 = r6.isDirectory()
            r5 = 0
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = r6.getName()
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r1)
            java.lang.String r0 = r6.getParent()
            java.io.File r3 = new java.io.File
            r3.<init>(r0, r1)
            goto L_0x0032
        L_0x0030:
            r1 = 0
            goto L_0x0010
        L_0x0032:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x005f }
            r1.<init>(r3)     // Catch:{ IOException -> 0x005f }
            r0 = 262144(0x40000, float:3.67342E-40)
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x005f }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x005f }
            java.util.zip.ZipOutputStream r1 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x005a }
            r1.<init>(r2)     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "."
            X.AnonymousClass0QL.A01(r6, r0, r1)     // Catch:{ all -> 0x0055 }
            r1.flush()     // Catch:{ all -> 0x0055 }
            r1.finish()     // Catch:{ all -> 0x0055 }
            r1.close()     // Catch:{ all -> 0x005a }
            r2.close()     // Catch:{ IOException -> 0x005f }
            goto L_0x0079
        L_0x0055:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0059 }
        L_0x0059:
            throw r0     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x005e }
        L_0x005e:
            throw r0     // Catch:{ IOException -> 0x005f }
        L_0x005f:
            r3.delete()
            goto L_0x007a
        L_0x0063:
            java.io.File[] r1 = r6.listFiles()
            if (r1 == 0) goto L_0x00e2
            int r0 = r1.length
            if (r0 == 0) goto L_0x00e2
            r5 = r1[r4]
            java.io.File r0 = r8.A0A
            java.io.File r3 = r0.getParentFile()
            java.lang.String r0 = r5.getName()
            goto L_0x009a
        L_0x0079:
            r5 = r3
        L_0x007a:
            java.lang.String r2 = "yyyy-MM-dd'T'HH-mm-ss"
            java.util.Locale r0 = java.util.Locale.US
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r2, r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r2 = r1.format(r0)
            java.io.File r3 = r5.getParentFile()
            java.lang.String r1 = "-"
            java.lang.String r0 = r5.getName()
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)
        L_0x009a:
            java.io.File r2 = new java.io.File
            r2.<init>(r3, r0)
            boolean r0 = r5.renameTo(r2)
            if (r0 == 0) goto L_0x00e2
            X.0JN r5 = r7.A06
            boolean r0 = r5.AC3(r8, r2)
            if (r0 == 0) goto L_0x00e2
            monitor-enter(r7)
            int r0 = r8.A03     // Catch:{ all -> 0x00df }
            r0 = r0 & 3
            if (r0 == 0) goto L_0x00b5
            r4 = 1
        L_0x00b5:
            X.0VF r1 = r7.A01     // Catch:{ all -> 0x00df }
            r1.A04(r2, r4)     // Catch:{ all -> 0x00df }
            r7.A05()     // Catch:{ all -> 0x00df }
            X.0VE r4 = r1.A02     // Catch:{ all -> 0x00df }
            X.0VE r0 = new X.0VE     // Catch:{ all -> 0x00df }
            r0.<init>()     // Catch:{ all -> 0x00df }
            r1.A02 = r0     // Catch:{ all -> 0x00df }
            monitor-exit(r7)     // Catch:{ all -> 0x00df }
            r5.CPq(r8)
            int r3 = r4.A02
            int r0 = r4.A03
            int r3 = r3 + r0
            int r0 = r4.A01
            int r3 = r3 + r0
            int r0 = r4.A04
            int r3 = r3 + r0
            int r2 = r4.A06
            int r1 = r4.A05
            int r0 = r4.A00
            r5.CPp(r3, r2, r1, r0)
            return
        L_0x00df:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00df }
            throw r0
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08000cZ.A03(com.facebook.profilo.ipc.TraceContext):void");
    }

    public final File A04(AnonymousClass0Uk r7, TraceContext traceContext) {
        File file;
        if ((traceContext.A03 & 2) == 0) {
            Set A032 = ProvidersRegistry.A00.A03(r7.getSupportedProviders());
            if (!A032.isEmpty()) {
                synchronized (this) {
                    file = this.A01.A06;
                }
                File file2 = new File(new File(file, traceContext.A0D.replace("+", "_p_").replace("/", "_s_")), "extra");
                if (!file2.isDirectory() && !file2.mkdirs()) {
                    Log.w("Profilo/TraceOrchestrator", "Failed to create extra data file! This could be because another process created it");
                    if (!file2.exists() || !file2.isDirectory()) {
                        return null;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("main");
                sb.append("-");
                sb.append(Process.myPid());
                sb.append("-");
                sb.append((String) A032.iterator().next());
                return new File(file2, sb.toString());
            }
        }
        return null;
    }

    public final void CPv(TraceContext traceContext, int i) {
        IllegalStateException th;
        AnonymousClass0UJ r2;
        try {
            this.A06.CPv(traceContext, i);
            Log.w("Profilo/TraceOrchestrator", AnonymousClass00U.A0L("Trace is aborted with code: ", C05650Up.A00(i)));
            C05680Uw r22 = C05680Uw.A0A;
            if (r22 != null) {
                r22.A07(traceContext.A06, i);
                File file = traceContext.A0A;
                if (file.exists()) {
                    synchronized (this) {
                        try {
                            r2 = this.A09;
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                                break;
                            }
                        }
                    }
                    if (r2 != null && i == 4) {
                        int optSystemConfigParamInt = r2.optSystemConfigParamInt("system_config.timed_out_upload_sample_rate", 0);
                        if (optSystemConfigParamInt != 0 && this.A08.nextInt(optSystemConfigParamInt) == 0) {
                            A03(traceContext);
                        }
                    }
                    AnonymousClass0QL.A00(file);
                }
                A02(traceContext);
                return;
            }
            th = new IllegalStateException("No TraceControl when cleaning up aborted trace");
            throw th;
        } catch (Exception e) {
            Log.e("Profilo/TraceOrchestrator", "failed to delete directory", e);
        } catch (Throwable th3) {
            A02(traceContext);
            throw th3;
        }
    }

    public final void CPw(TraceContext traceContext) {
        try {
            this.A06.CPw(traceContext);
            if (traceContext.A0A.exists()) {
                A03(traceContext);
                AnonymousClass0QL.A00(traceContext.A0A);
            }
        } catch (Exception e) {
            Log.e("Profilo/TraceOrchestrator", "failed to delete directory", e);
        } catch (Throwable th) {
            A02(traceContext);
            throw th;
        }
        A02(traceContext);
    }

    public final void CPx(TraceContext traceContext, Throwable th) {
        Log.e("Profilo/TraceOrchestrator", "Write exception", th);
        this.A06.CPx(traceContext, th);
        CPv(traceContext, 8);
    }

    public final void CPy(TraceContext traceContext) {
        this.A06.CPy(traceContext);
    }

    public final void CRs(File file, int i) {
        this.A06.CRs(file, i);
    }
}
