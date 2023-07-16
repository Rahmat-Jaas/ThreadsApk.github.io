package X;

import android.os.Process;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.react.modules.appstate.AppStateModule;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0lf  reason: invalid class name and case insensitive filesystem */
public final class C12300lf {
    public static volatile C12300lf A06;
    public File A00;
    public C04560Oe A01;
    public C18150wG[] A02;
    public boolean A03;
    public final Map A04 = new LinkedHashMap();
    public final Lock A05 = new ReentrantLock(true);

    public static C12300lf A00() {
        if (A06 == null) {
            synchronized (C12300lf.class) {
                if (A06 == null) {
                    A06 = new C12300lf();
                }
            }
        }
        return A06;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(23:16|17|(1:19)(1:24)|20|(1:22)|23|(2:26|(5:27|(4:30|(2:33|181)|34|28)|180|35|(1:37)(1:179)))(0)|(8:39|40|41|(1:43)|44|(2:(4:46|(3:49|(2:186|51)(9:52|(2:54|(1:56))|57|(1:59)|60|(1:(3:63|73|(2:188|185)(5:75|(1:77)|78|(1:80)|81))(2:172|83))(2:64|(2:187|185)(5:66|(1:68)|69|(1:71)|72))|82|189|185)|47)|184|84)|90)|195|(2:85|(11:87|(2:191|89)|91|(2:93|(1:95))|96|(1:98)|99|(1:(3:102|112|(2:193|190)(5:114|(1:116)|117|(1:119)|120))(2:171|122))(2:103|(2:192|190)(5:105|(1:107)|108|(1:110)|111))|121|194|190)(0)))(0)|124|125|126|127|128|(1:130)|131|(3:133|(2:135|197)(1:198)|136)|196|137|(3:139|(2:141|200)(1:(2:144|202)(1:201))|142)|199|152|176|153) */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02fc, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03a6, code lost:
        if (r4 == false) goto L_0x03ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03a8, code lost:
        r1 = r20.toArray(new X.AnonymousClass011[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03b0, code lost:
        if (r1 == null) goto L_0x03ca;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:124:0x02fd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:148:0x035b */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0343  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass011[] A01(X.C18130wE r30, java.io.File r31) {
        /*
            java.util.ArrayList r23 = new java.util.ArrayList
            r23.<init>()
            r22 = 0
        L_0x0007:
            X.0wE r8 = new X.0wE
            r8.<init>()
            java.lang.String r21 = java.lang.String.valueOf(r22)
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            r7 = 0
            r6 = 0
            r4 = 0
        L_0x0018:
            r3 = r21
            boolean r0 = r21.isEmpty()
            if (r0 == 0) goto L_0x03c0
            java.lang.String r3 = java.lang.String.valueOf(r6)
        L_0x0024:
            java.lang.String r2 = r31.getAbsolutePath()
            java.lang.String r1 = "/"
            java.lang.String r0 = "qpl_v2_"
            java.lang.String r0 = X.AnonymousClass00U.A0d(r2, r1, r0, r3)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x03a6
            r5 = 1
            r8.A0A = r5
            X.0wE r4 = new X.0wE
            r4.<init>()
            java.lang.String r2 = r1.getAbsolutePath()
            r3 = 2
            r4.A07 = r3
            java.util.concurrent.atomic.AtomicInteger r19 = new java.util.concurrent.atomic.AtomicInteger
            r19.<init>()
            java.util.concurrent.atomic.AtomicInteger r18 = new java.util.concurrent.atomic.AtomicInteger
            r18.<init>()
            java.lang.String r1 = "r"
            java.io.RandomAccessFile r17 = new java.io.RandomAccessFile     // Catch:{ all -> 0x035c }
            r0 = r17
            r0.<init>(r2, r1)     // Catch:{ all -> 0x035c }
            int r0 = r17.readInt()     // Catch:{ all -> 0x0357 }
            if (r0 == r3) goto L_0x006a
            X.011[] r10 = new X.AnonymousClass011[r7]     // Catch:{ all -> 0x0357 }
            r17.close()     // Catch:{ all -> 0x035c }
            goto L_0x0395
        L_0x006a:
            int r12 = r17.readInt()     // Catch:{ all -> 0x0357 }
            int r2 = r17.readInt()     // Catch:{ all -> 0x0357 }
            r10 = 16
            int r0 = r12 + -16
            long r0 = (long) r0     // Catch:{ all -> 0x0357 }
            r11 = 0
            r15 = 0
            int r9 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ad
            java.nio.channels.FileChannel r24 = r17.getChannel()     // Catch:{ all -> 0x0357 }
            java.nio.channels.FileChannel$MapMode r25 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0357 }
            long r9 = (long) r10     // Catch:{ all -> 0x0357 }
            r26 = r9
            r28 = r0
            java.nio.MappedByteBuffer r10 = r24.map(r25, r26, r28)     // Catch:{ all -> 0x0357 }
        L_0x008d:
            long r13 = r17.length()     // Catch:{ all -> 0x0357 }
            long r0 = (long) r12     // Catch:{ all -> 0x0357 }
            long r13 = r13 - r0
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 <= 0) goto L_0x00a7
            java.nio.channels.FileChannel r11 = r17.getChannel()     // Catch:{ all -> 0x0357 }
            java.nio.channels.FileChannel$MapMode r12 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0357 }
            long r15 = r17.length()     // Catch:{ all -> 0x0357 }
            long r15 = r15 - r0
            r13 = r0
            java.nio.MappedByteBuffer r11 = r11.map(r12, r13, r15)     // Catch:{ all -> 0x0357 }
        L_0x00a7:
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x0357 }
            r9.<init>()     // Catch:{ all -> 0x0357 }
            goto L_0x00af
        L_0x00ad:
            r10 = r11
            goto L_0x008d
        L_0x00af:
            if (r10 == 0) goto L_0x00f7
            X.0wD r12 = new X.0wD     // Catch:{ all -> 0x0357 }
            r12.<init>(r10)     // Catch:{ all -> 0x0357 }
            java.nio.IntBuffer r0 = r12.A01     // Catch:{ all -> 0x0357 }
            r24 = r0
            r0.position(r7)     // Catch:{ all -> 0x0357 }
            r13 = 0
        L_0x00be:
            r10 = 0
        L_0x00bf:
            int r0 = r12.A00     // Catch:{ all -> 0x0357 }
            if (r10 >= r0) goto L_0x00f2
            int r15 = r24.get()     // Catch:{ all -> 0x0357 }
            int r14 = r24.get()     // Catch:{ all -> 0x0357 }
            int r16 = r24.get()     // Catch:{ all -> 0x0357 }
            if (r15 == 0) goto L_0x00ef
            if (r16 == 0) goto L_0x00ef
            r0 = 268435455(0xfffffff, float:2.5243547E-29)
            r0 = r16 & r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0357 }
            X.011 r0 = new X.011     // Catch:{ all -> 0x0357 }
            r0.<init>(r15, r14)     // Catch:{ all -> 0x0357 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0357 }
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r16 = r16 & r0
            int r1 = r16 >>> 28
            r0 = r19
            r0.addAndGet(r1)     // Catch:{ all -> 0x0357 }
        L_0x00ef:
            int r10 = r10 + 1
            goto L_0x00bf
        L_0x00f2:
            int r13 = r13 + 1
            if (r13 >= r3) goto L_0x00f7
            goto L_0x00be
        L_0x00f7:
            if (r11 == 0) goto L_0x02fd
            X.0um r13 = new X.0um     // Catch:{ all -> 0x0357 }
            r13.<init>()     // Catch:{ all -> 0x0357 }
            X.0nc r12 = new X.0nc     // Catch:{ all -> 0x0357 }
            r12.<init>()     // Catch:{ all -> 0x0357 }
            int r0 = r11.getInt()     // Catch:{ IOException -> 0x02fd }
            r13.A00 = r0     // Catch:{ IOException -> 0x02fd }
            int r0 = r11.getInt()     // Catch:{ IOException -> 0x02fd }
            r13.A02 = r0     // Catch:{ IOException -> 0x02fd }
            int r0 = r11.getInt()     // Catch:{ IOException -> 0x02fd }
            r13.A01 = r0     // Catch:{ IOException -> 0x02fd }
            int r0 = r13.A02     // Catch:{ IOException -> 0x02fd }
            r1 = 0
            if (r0 >= 0) goto L_0x011b
            r1 = 1
        L_0x011b:
            r13.A03 = r1     // Catch:{ IOException -> 0x02fd }
            int r0 = java.lang.Math.abs(r0)     // Catch:{ IOException -> 0x02fd }
            r13.A02 = r0     // Catch:{ IOException -> 0x02fd }
            if (r1 == 0) goto L_0x0214
        L_0x0125:
            r11.position(r0)     // Catch:{ IOException -> 0x02fd }
        L_0x0128:
            int r0 = r11.position()     // Catch:{ IOException -> 0x02fd }
            int r1 = r0 + 4
            int r0 = r13.A01     // Catch:{ IOException -> 0x02fd }
            if (r1 > r0) goto L_0x0211
            int r15 = r11.getInt()     // Catch:{ IOException -> 0x02fd }
            if (r15 != 0) goto L_0x013f
            int r0 = r11.limit()     // Catch:{ IOException -> 0x02fd }
            int r0 = r0 + -1
            goto L_0x0125
        L_0x013f:
            byte r0 = r11.get()     // Catch:{ IOException -> 0x02fd }
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x02fd }
            r12.A01 = r0     // Catch:{ IOException -> 0x02fd }
            r11.get(r0)     // Catch:{ IOException -> 0x02fd }
            byte[] r0 = r12.A01     // Catch:{ IOException -> 0x02fd }
            int r0 = r0.length     // Catch:{ IOException -> 0x02fd }
            int r10 = r0 + 1
            byte r1 = r11.get()     // Catch:{ IOException -> 0x02fd }
            r12.A00 = r7     // Catch:{ IOException -> 0x02fd }
            r3 = 1
            if (r1 >= 0) goto L_0x0169
            int r1 = java.lang.Math.abs(r1)     // Catch:{ IOException -> 0x02fd }
            r12.A00 = r1     // Catch:{ IOException -> 0x02fd }
            int[] r0 = X.C13390nc.A03     // Catch:{ IOException -> 0x02fd }
            r1 = r0[r1]     // Catch:{ IOException -> 0x02fd }
            if (r1 > 0) goto L_0x0169
            byte r1 = r11.get()     // Catch:{ IOException -> 0x02fd }
            r3 = 2
        L_0x0169:
            byte[] r0 = new byte[r1]     // Catch:{ IOException -> 0x02fd }
            r12.A02 = r0     // Catch:{ IOException -> 0x02fd }
            r11.get(r0)     // Catch:{ IOException -> 0x02fd }
            int r3 = r3 + r1
            int r10 = r10 + r3
            int r1 = r10 % 4
            if (r1 == 0) goto L_0x0180
            int r0 = r11.position()     // Catch:{ IOException -> 0x02fd }
            int r0 = r0 + 4
            int r0 = r0 - r1
            r11.position(r0)     // Catch:{ IOException -> 0x02fd }
        L_0x0180:
            byte[] r0 = r12.A01     // Catch:{ IOException -> 0x02fd }
            java.lang.String r14 = new java.lang.String     // Catch:{ IOException -> 0x02fd }
            r14.<init>(r0)     // Catch:{ IOException -> 0x02fd }
            int r1 = r12.A00     // Catch:{ IOException -> 0x02fd }
            if (r1 == 0) goto L_0x018e
            if (r1 != r5) goto L_0x0204
            goto L_0x01c0
        L_0x018e:
            byte[] r0 = r12.A02     // Catch:{ IOException -> 0x02fd }
            java.lang.String r10 = new java.lang.String     // Catch:{ IOException -> 0x02fd }
            r10.<init>(r0)     // Catch:{ IOException -> 0x02fd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)     // Catch:{ IOException -> 0x02fd }
            java.lang.Object r3 = r9.get(r0)     // Catch:{ IOException -> 0x02fd }
            X.011 r3 = (X.AnonymousClass011) r3     // Catch:{ IOException -> 0x02fd }
            if (r3 == 0) goto L_0x0128
            java.util.List r1 = r3.A02     // Catch:{ IOException -> 0x02fd }
            if (r1 != 0) goto L_0x01ac
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ IOException -> 0x02fd }
            r1.<init>()     // Catch:{ IOException -> 0x02fd }
            r3.A02 = r1     // Catch:{ IOException -> 0x02fd }
        L_0x01ac:
            java.util.List r0 = r3.A03     // Catch:{ IOException -> 0x02fd }
            if (r0 != 0) goto L_0x01b7
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x02fd }
            r0.<init>()     // Catch:{ IOException -> 0x02fd }
            r3.A03 = r0     // Catch:{ IOException -> 0x02fd }
        L_0x01b7:
            r1.add(r14)     // Catch:{ IOException -> 0x02fd }
            java.util.List r0 = r3.A03     // Catch:{ IOException -> 0x02fd }
            r0.add(r10)     // Catch:{ IOException -> 0x02fd }
            goto L_0x01ff
        L_0x01c0:
            byte[] r1 = r12.A02     // Catch:{ IOException -> 0x02fd }
            java.nio.ByteBuffer r0 = X.C11420kA.A04     // Catch:{ IOException -> 0x02fd }
            r0.position(r7)     // Catch:{ IOException -> 0x02fd }
            r0.put(r1)     // Catch:{ IOException -> 0x02fd }
            r0.position(r7)     // Catch:{ IOException -> 0x02fd }
            int r10 = r0.getInt()     // Catch:{ IOException -> 0x02fd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)     // Catch:{ IOException -> 0x02fd }
            java.lang.Object r3 = r9.get(r0)     // Catch:{ IOException -> 0x02fd }
            X.011 r3 = (X.AnonymousClass011) r3     // Catch:{ IOException -> 0x02fd }
            if (r3 == 0) goto L_0x0128
            java.util.List r1 = r3.A00     // Catch:{ IOException -> 0x02fd }
            if (r1 != 0) goto L_0x01e8
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ IOException -> 0x02fd }
            r1.<init>()     // Catch:{ IOException -> 0x02fd }
            r3.A00 = r1     // Catch:{ IOException -> 0x02fd }
        L_0x01e8:
            java.util.List r0 = r3.A01     // Catch:{ IOException -> 0x02fd }
            if (r0 != 0) goto L_0x01f3
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x02fd }
            r0.<init>()     // Catch:{ IOException -> 0x02fd }
            r3.A01 = r0     // Catch:{ IOException -> 0x02fd }
        L_0x01f3:
            r1.add(r14)     // Catch:{ IOException -> 0x02fd }
            java.util.List r1 = r3.A01     // Catch:{ IOException -> 0x02fd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x02fd }
            r1.add(r0)     // Catch:{ IOException -> 0x02fd }
        L_0x01ff:
            r18.incrementAndGet()     // Catch:{ IOException -> 0x02fd }
            goto L_0x0128
        L_0x0204:
            java.lang.String r0 = "Unsupported type: "
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r1)     // Catch:{ IOException -> 0x02fd }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x02fd }
            r1.<init>(r0)     // Catch:{ IOException -> 0x02fd }
            goto L_0x02fc
        L_0x0211:
            r0 = 12
            goto L_0x0228
        L_0x0214:
            int r1 = r11.position()     // Catch:{ IOException -> 0x02fd }
            int r0 = r13.A00     // Catch:{ IOException -> 0x02fd }
            if (r1 >= r0) goto L_0x02fd
            int r15 = r11.getInt()     // Catch:{ IOException -> 0x02fd }
            if (r15 != 0) goto L_0x022c
            int r0 = r11.limit()     // Catch:{ IOException -> 0x02fd }
            int r0 = r0 + -1
        L_0x0228:
            r11.position(r0)     // Catch:{ IOException -> 0x02fd }
            goto L_0x0214
        L_0x022c:
            byte r0 = r11.get()     // Catch:{ IOException -> 0x02fd }
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x02fd }
            r12.A01 = r0     // Catch:{ IOException -> 0x02fd }
            r11.get(r0)     // Catch:{ IOException -> 0x02fd }
            byte[] r0 = r12.A01     // Catch:{ IOException -> 0x02fd }
            int r0 = r0.length     // Catch:{ IOException -> 0x02fd }
            int r10 = r0 + 1
            byte r1 = r11.get()     // Catch:{ IOException -> 0x02fd }
            r12.A00 = r7     // Catch:{ IOException -> 0x02fd }
            r3 = 1
            if (r1 >= 0) goto L_0x0256
            int r1 = java.lang.Math.abs(r1)     // Catch:{ IOException -> 0x02fd }
            r12.A00 = r1     // Catch:{ IOException -> 0x02fd }
            int[] r0 = X.C13390nc.A03     // Catch:{ IOException -> 0x02fd }
            r1 = r0[r1]     // Catch:{ IOException -> 0x02fd }
            if (r1 > 0) goto L_0x0256
            byte r1 = r11.get()     // Catch:{ IOException -> 0x02fd }
            r3 = 2
        L_0x0256:
            byte[] r0 = new byte[r1]     // Catch:{ IOException -> 0x02fd }
            r12.A02 = r0     // Catch:{ IOException -> 0x02fd }
            r11.get(r0)     // Catch:{ IOException -> 0x02fd }
            int r3 = r3 + r1
            int r10 = r10 + r3
            int r1 = r10 % 4
            if (r1 == 0) goto L_0x026d
            int r0 = r11.position()     // Catch:{ IOException -> 0x02fd }
            int r0 = r0 + 4
            int r0 = r0 - r1
            r11.position(r0)     // Catch:{ IOException -> 0x02fd }
        L_0x026d:
            byte[] r0 = r12.A01     // Catch:{ IOException -> 0x02fd }
            java.lang.String r14 = new java.lang.String     // Catch:{ IOException -> 0x02fd }
            r14.<init>(r0)     // Catch:{ IOException -> 0x02fd }
            int r1 = r12.A00     // Catch:{ IOException -> 0x02fd }
            if (r1 == 0) goto L_0x027b
            if (r1 != r5) goto L_0x02f1
            goto L_0x02ad
        L_0x027b:
            byte[] r0 = r12.A02     // Catch:{ IOException -> 0x02fd }
            java.lang.String r10 = new java.lang.String     // Catch:{ IOException -> 0x02fd }
            r10.<init>(r0)     // Catch:{ IOException -> 0x02fd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)     // Catch:{ IOException -> 0x02fd }
            java.lang.Object r3 = r9.get(r0)     // Catch:{ IOException -> 0x02fd }
            X.011 r3 = (X.AnonymousClass011) r3     // Catch:{ IOException -> 0x02fd }
            if (r3 == 0) goto L_0x0214
            java.util.List r1 = r3.A02     // Catch:{ IOException -> 0x02fd }
            if (r1 != 0) goto L_0x0299
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ IOException -> 0x02fd }
            r1.<init>()     // Catch:{ IOException -> 0x02fd }
            r3.A02 = r1     // Catch:{ IOException -> 0x02fd }
        L_0x0299:
            java.util.List r0 = r3.A03     // Catch:{ IOException -> 0x02fd }
            if (r0 != 0) goto L_0x02a4
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x02fd }
            r0.<init>()     // Catch:{ IOException -> 0x02fd }
            r3.A03 = r0     // Catch:{ IOException -> 0x02fd }
        L_0x02a4:
            r1.add(r14)     // Catch:{ IOException -> 0x02fd }
            java.util.List r0 = r3.A03     // Catch:{ IOException -> 0x02fd }
            r0.add(r10)     // Catch:{ IOException -> 0x02fd }
            goto L_0x02ec
        L_0x02ad:
            byte[] r1 = r12.A02     // Catch:{ IOException -> 0x02fd }
            java.nio.ByteBuffer r0 = X.C11420kA.A04     // Catch:{ IOException -> 0x02fd }
            r0.position(r7)     // Catch:{ IOException -> 0x02fd }
            r0.put(r1)     // Catch:{ IOException -> 0x02fd }
            r0.position(r7)     // Catch:{ IOException -> 0x02fd }
            int r10 = r0.getInt()     // Catch:{ IOException -> 0x02fd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)     // Catch:{ IOException -> 0x02fd }
            java.lang.Object r3 = r9.get(r0)     // Catch:{ IOException -> 0x02fd }
            X.011 r3 = (X.AnonymousClass011) r3     // Catch:{ IOException -> 0x02fd }
            if (r3 == 0) goto L_0x0214
            java.util.List r1 = r3.A00     // Catch:{ IOException -> 0x02fd }
            if (r1 != 0) goto L_0x02d5
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ IOException -> 0x02fd }
            r1.<init>()     // Catch:{ IOException -> 0x02fd }
            r3.A00 = r1     // Catch:{ IOException -> 0x02fd }
        L_0x02d5:
            java.util.List r0 = r3.A01     // Catch:{ IOException -> 0x02fd }
            if (r0 != 0) goto L_0x02e0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x02fd }
            r0.<init>()     // Catch:{ IOException -> 0x02fd }
            r3.A01 = r0     // Catch:{ IOException -> 0x02fd }
        L_0x02e0:
            r1.add(r14)     // Catch:{ IOException -> 0x02fd }
            java.util.List r1 = r3.A01     // Catch:{ IOException -> 0x02fd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x02fd }
            r1.add(r0)     // Catch:{ IOException -> 0x02fd }
        L_0x02ec:
            r18.incrementAndGet()     // Catch:{ IOException -> 0x02fd }
            goto L_0x0214
        L_0x02f1:
            java.lang.String r0 = "Unsupported type: "
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r1)     // Catch:{ IOException -> 0x02fd }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x02fd }
            r1.<init>(r0)     // Catch:{ IOException -> 0x02fd }
        L_0x02fc:
            throw r1     // Catch:{ IOException -> 0x02fd }
        L_0x02fd:
            r4.A0A = r5     // Catch:{ all -> 0x0357 }
            java.util.Collection r1 = r9.values()     // Catch:{ all -> 0x0357 }
            X.011[] r0 = new X.AnonymousClass011[r7]     // Catch:{ all -> 0x0357 }
            java.lang.Object[] r10 = r1.toArray(r0)     // Catch:{ all -> 0x0357 }
            X.011[] r10 = (X.AnonymousClass011[]) r10     // Catch:{ all -> 0x0357 }
            r17.close()     // Catch:{ all -> 0x035c }
            int r9 = r10.length
            r4.A02 = r9
            r0 = -1
            if (r2 == r0) goto L_0x0317
            int r2 = r2 - r9
            r4.A01 = r2
        L_0x0317:
            r4.A03 = r9
            r4.A04 = r9
            r4.A08 = r0
            int r0 = r19.get()
            r4.A06 = r0
            int r0 = r18.get()
            r4.A00 = r0
            r3 = -1
            r2 = 0
        L_0x032b:
            if (r2 >= r9) goto L_0x033e
            r1 = r10[r2]
            int r0 = r1.A05
            if (r3 == r0) goto L_0x0339
            int r0 = r4.A05
            int r0 = r0 + 1
            r4.A05 = r0
        L_0x0339:
            int r3 = r1.A05
            int r2 = r2 + 1
            goto L_0x032b
        L_0x033e:
            r5 = 0
            r3 = 0
            r2 = 1
        L_0x0341:
            if (r5 >= r9) goto L_0x0392
            r1 = r10[r5]
            int r0 = r1.A05
            if (r0 != r3) goto L_0x0350
            int r2 = r2 + 1
        L_0x034b:
            int r3 = r1.A05
            int r5 = r5 + 1
            goto L_0x0341
        L_0x0350:
            if (r3 == 0) goto L_0x034b
            r4.A00(r3, r2)
            r2 = 1
            goto L_0x034b
        L_0x0357:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x035b }
        L_0x035b:
            throw r0     // Catch:{ all -> 0x035c }
        L_0x035c:
            r2 = move-exception
            r0 = 0
            r4.A09 = r0
            r4.A07 = r7
            r4.A0A = r7
            r4.A04 = r7
            r4.A03 = r7
            r4.A02 = r7
            r4.A05 = r7
            r0 = -1
            r4.A01 = r0
            int[] r0 = r4.A0B
            java.util.Arrays.fill(r0, r7)
            int[] r1 = r4.A0C
            java.util.Arrays.fill(r1, r7)
            int[] r0 = r4.A0D
            java.util.Arrays.fill(r0, r7)
            java.util.Arrays.fill(r1, r7)
            r4.A08 = r7
            r4.A06 = r7
            r4.A00 = r7
            r4.A0A = r7
            java.lang.String r0 = r2.getMessage()
            r4.A09 = r0
            X.011[] r10 = new X.AnonymousClass011[r7]
            goto L_0x0395
        L_0x0392:
            r4.A00(r3, r2)
        L_0x0395:
            java.util.List r1 = java.util.Arrays.asList(r10)
            r0 = r20
            r0.addAll(r1)
            r8.A01(r4)
            int r6 = r6 + 1
            r4 = 1
            goto L_0x0018
        L_0x03a6:
            if (r4 == 0) goto L_0x03ca
            X.011[] r1 = new X.AnonymousClass011[r7]
            r0 = r20
            java.lang.Object[] r1 = r0.toArray(r1)
            if (r1 == 0) goto L_0x03ca
            r0 = r23
            r0.add(r1)
            r0 = r30
            r0.A01(r8)
            int r22 = r22 + 1
            goto L_0x0007
        L_0x03c0:
            if (r6 == 0) goto L_0x0024
            java.lang.String r1 = "_"
            java.lang.String r3 = X.AnonymousClass00U.A0R(r3, r1, r6)
            goto L_0x0024
        L_0x03ca:
            java.util.Iterator r2 = r23.iterator()
            r1 = 0
        L_0x03cf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03de
            java.lang.Object r0 = r2.next()
            X.011[] r0 = (X.AnonymousClass011[]) r0
            int r0 = r0.length
            int r1 = r1 + r0
            goto L_0x03cf
        L_0x03de:
            X.011[] r7 = new X.AnonymousClass011[r1]
            java.util.Iterator r6 = r23.iterator()
            r5 = 0
        L_0x03e5:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x03ff
            java.lang.Object r4 = r6.next()
            X.011[] r4 = (X.AnonymousClass011[]) r4
            int r3 = r4.length
            r2 = 0
        L_0x03f3:
            if (r2 >= r3) goto L_0x03e5
            r1 = r4[r2]
            int r0 = r5 + 1
            r7[r5] = r1
            int r2 = r2 + 1
            r5 = r0
            goto L_0x03f3
        L_0x03ff:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12300lf.A01(X.0wE, java.io.File):X.011[]");
    }

    public final void A02(C18150wG... r50) {
        double d;
        int i;
        String str;
        short s;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        C09350fH A0T;
        Lock lock = this.A05;
        lock.lock();
        try {
            Map map = this.A04;
            C18150wG[] r21 = r50;
            if (map.isEmpty()) {
                this.A02 = r21;
            } else if (!this.A03) {
                AnonymousClass01V r0 = (AnonymousClass01V) map.values().iterator().next();
                int length = r21.length;
                for (int i2 = 0; i2 < length; i2++) {
                    C18150wG r2 = r50[i2];
                    File file = r2.A00;
                    Integer num = r2.A01;
                    boolean z = r2.A03;
                    String str2 = r2.A02;
                    new File(file, "qpl_processed").exists();
                    r0.markerStart(27794854);
                    C18130wE r1 = new C18130wE();
                    r1.A0A = true;
                    int i3 = 0;
                    for (AnonymousClass011 r22 : A01(r1, file)) {
                        int intValue = num.intValue();
                        if (intValue != 0) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        int i4 = r22.A05;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        if (r0.A0b) {
                            r0.A0K.add(Long.valueOf(AnonymousClass0WK.A00(i4, 0)));
                        }
                        if (r0.A0a) {
                            String A07 = AnonymousClass01V.A07(i4, 0, r0.A0e, r0.A0c, r0.A0d);
                            if (!(A07 == null || ((int) r0.A0k.B8d(i4)) == 0 || (A0T = r0.A0T(AnonymousClass0WW.A08, A07, (String) null, timeUnit, i4, 0, 24, 0, i, 0, false, false)) == null)) {
                                AnonymousClass0WK r34 = r0.A09;
                                r34.A09((AnonymousClass0WA) null, r0.A0R(), A0T, "join_id", A07, Process.myTid());
                                r34.A09((AnonymousClass0WA) null, r0.A0R(), A0T, "source", DexOptimization.OPT_KEY_CLIENT, Process.myTid());
                                r0.A0I.put(String.valueOf(AnonymousClass0WK.A00(i4, 0)), A07);
                            }
                        } else if (((int) r0.A0k.B8d(i4)) != 0) {
                            r0.A0T(AnonymousClass0WW.A08, (String) null, (String) null, timeUnit, i4, 0, 24, 0, i, 0, false, false);
                        }
                        if (z) {
                            str = "foreground";
                        } else {
                            str = AppStateModule.APP_STATE_BACKGROUND;
                        }
                        r0.markerAnnotate(i4, 0, "qpl_cr_foreground_status", str);
                        if (str2 != null) {
                            r0.markerAnnotate(i4, 0, "exit_type", str2);
                        }
                        List list7 = r22.A02;
                        if (!(list7 == null || Collections.unmodifiableList(list7) == null || (list4 = r22.A03) == null || Collections.unmodifiableList(list4) == null)) {
                            List list8 = r22.A02;
                            if (list8 != null) {
                                list5 = Collections.unmodifiableList(list8);
                            } else {
                                list5 = null;
                            }
                            Iterator it = list5.iterator();
                            List list9 = r22.A03;
                            if (list9 != null) {
                                list6 = Collections.unmodifiableList(list9);
                            } else {
                                list6 = null;
                            }
                            Iterator it2 = list6.iterator();
                            while (it.hasNext() && it2.hasNext()) {
                                String str3 = (String) it.next();
                                String str4 = (String) it2.next();
                                if (AnonymousClass01V.A0O(r0, str3)) {
                                    r0.A09.A0B((AnonymousClass0WA) null, r0.A0R(), str3, str4, i4, 0, Process.myTid());
                                }
                            }
                        }
                        List list10 = r22.A00;
                        if (!(list10 == null || Collections.unmodifiableList(list10) == null || (list = r22.A01) == null || Collections.unmodifiableList(list) == null)) {
                            List list11 = r22.A00;
                            if (list11 != null) {
                                list2 = Collections.unmodifiableList(list11);
                            } else {
                                list2 = null;
                            }
                            Iterator it3 = list2.iterator();
                            List list12 = r22.A01;
                            if (list12 != null) {
                                list3 = Collections.unmodifiableList(list12);
                            } else {
                                list3 = null;
                            }
                            Iterator it4 = list3.iterator();
                            while (it3.hasNext() && it4.hasNext()) {
                                String str5 = (String) it3.next();
                                int intValue2 = ((Integer) it4.next()).intValue();
                                if (AnonymousClass01V.A0O(r0, str5)) {
                                    r0.A09.A0A((AnonymousClass0WA) null, r0.A0R(), str5, i4, 0, intValue2, Process.myTid());
                                }
                            }
                        }
                        if (intValue != 0) {
                            s = 722;
                        } else {
                            s = 2001;
                        }
                        r0.A0f(AnonymousClass0WW.A08, (String) null, timeUnit, i4, 0, 16, 0, 0, s);
                    }
                    int i5 = r1.A01 + r1.A02;
                    r0.markerAnnotate(27794854, "storage_version", r1.A07);
                    r0.markerAnnotate(27794854, "records_count", r1.A04);
                    r0.markerAnnotate(27794854, "markers_count", r1.A03);
                    r0.markerAnnotate(27794854, "active_markers_count", r1.A02);
                    r0.markerAnnotate(27794854, "unique_markers_count", r1.A05);
                    int i6 = r1.A01;
                    if (i6 >= 0) {
                        r0.markerAnnotate(27794854, "lost_active_markers_count", i6);
                        if (i5 == 0) {
                            d = 0.0d;
                        } else {
                            d = (double) (((float) r1.A01) / ((float) i5));
                        }
                        r0.markerAnnotate(27794854, "events_loss_ratio", d);
                    }
                    int i7 = r1.A08;
                    if (i7 > 0) {
                        r0.markerAnnotate(27794854, "time_window_sec", i7);
                    }
                    String str6 = r1.A09;
                    if (str6 != null) {
                        r0.markerAnnotate(27794854, "error", str6);
                    }
                    int i8 = r1.A06;
                    if (i8 > 0) {
                        double d2 = (double) i8;
                        r0.markerAnnotate(27794854, "annotations_loss_ratio", (d2 - ((double) r1.A00)) / d2);
                    }
                    while (true) {
                        int[] iArr = r1.A0D;
                        if (i3 >= iArr.length) {
                            break;
                        }
                        int i9 = iArr[i3];
                        int i10 = r1.A0E[i3];
                        if (i9 != 0) {
                            r0.markerStart(27802751);
                            r0.markerAnnotate(27802751, "storage_version", r1.A07);
                            r0.markerAnnotate(27802751, "markerId", i9);
                            r0.markerAnnotate(27802751, "count", i10);
                            r0.markerEnd(27802751, 2);
                        }
                        i3++;
                    }
                    r0.markerEnd(27794854, 2);
                    try {
                        new File(file, "qpl_processed").createNewFile();
                    } catch (IOException unused) {
                    }
                }
                this.A03 = true;
            }
        } finally {
            lock.unlock();
        }
    }
}
