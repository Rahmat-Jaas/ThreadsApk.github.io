package X;

import android.os.SystemClock;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Xw  reason: invalid class name and case insensitive filesystem */
public final class C06150Xw implements C04410Nm {
    public static final Map A0J;
    public int A00 = 0;
    public int A01 = Integer.MAX_VALUE;
    public int A02 = Integer.MAX_VALUE;
    public long A03;
    public C04470Nu A04;
    public Boolean A05;
    public ScheduledExecutorService A06;
    public ScheduledFuture A07;
    public boolean A08;
    public boolean A09;
    public final byte A0A;
    public final C019809f A0B;
    public final C06120Xt A0C = new C06120Xt(this);
    public final C06130Xu A0D = new C06130Xu(this);
    public final C06160Xx A0E;
    public final AnonymousClass0QI A0F;
    public final Runnable A0G = new C04380Nj(this);
    public final short A0H;
    public final C04440Nq A0I = new C06140Xv(this);

    public C06150Xw(C019809f r11, C04420Nn r12, AnonymousClass0QI r13, File file, int i) {
        int i2;
        this.A0F = r13;
        File file2 = new File(file, "hist.bin");
        if (!file2.exists()) {
            C06160Xx AEw = r12.AEw(file2, 4096);
            this.A0E = AEw;
            if (AEw != null) {
                Integer[] A002 = AnonymousClass006.A00(21);
                int length = A002.length;
                int[] iArr = new int[(length - 1)];
                for (int i3 = 1; i3 < length; i3++) {
                    int i4 = i3 - 1;
                    switch (A002[i3].intValue()) {
                        case 1:
                        case 7:
                        case 11:
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        case 13:
                        case 14:
                            i2 = 7;
                            break;
                        case 2:
                        case 4:
                        case 5:
                        case 9:
                        case 10:
                        case 15:
                        case 16:
                        case LangUtils.HASH_SEED /*17*/:
                        case 18:
                            i2 = 5;
                            break;
                        case 3:
                            i2 = 8;
                            break;
                        case 6:
                        case 19:
                        case 20:
                            i2 = 6;
                            break;
                        case 8:
                            i2 = 10;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    iArr[i4] = i2;
                }
                this.A04 = new C04470Nu(this.A0I, this.A0E.A00, iArr, (byte) -7, 4096, 0, false);
            }
            this.A0A = (byte) 0;
            this.A0H = i <= 32767 ? (short) i : Short.MAX_VALUE;
            this.A0B = r11;
            this.A05 = new Boolean(false);
            return;
        }
        throw new IllegalStateException(AnonymousClass00U.A0L("File exists: ", file2.getName()));
    }

    public static synchronized void A00(C06150Xw r7) {
        synchronized (r7) {
            C04470Nu r6 = r7.A04;
            if (r6 != null) {
                try {
                    long uptimeMillis = SystemClock.uptimeMillis() - r7.A03;
                    if (uptimeMillis > 2147483647L) {
                        uptimeMillis = 2147483647L;
                    }
                    int i = (int) uptimeMillis;
                    try {
                        C04470Nu.A05(r6);
                        int i2 = r6.A0C[0];
                        MappedByteBuffer mappedByteBuffer = r6.A09;
                        int position = mappedByteBuffer.position();
                        try {
                            mappedByteBuffer.position(i2);
                            mappedByteBuffer.putInt(i);
                            mappedByteBuffer.position(position);
                        } catch (Throwable th) {
                            th = th;
                            mappedByteBuffer.position(position);
                            throw th;
                        }
                    } catch (Exception e) {
                        C04790Pd.A00();
                        A01(r7, e, "Exception writing timestamp");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
        return;
    }

    public static synchronized void A01(C06150Xw r1, Exception exc, String str) {
        synchronized (r1) {
            r1.A03(exc, str, 0, 0);
        }
    }

    public static synchronized void A02(C06150Xw r6, Integer num, byte... bArr) {
        synchronized (r6) {
            C04470Nu r5 = r6.A04;
            if (r5 != null) {
                long uptimeMillis = SystemClock.uptimeMillis() - r6.A03;
                if (uptimeMillis > 2147483647L) {
                    uptimeMillis = 2147483647L;
                }
                int i = (int) uptimeMillis;
                int length = bArr.length;
                byte[] bArr2 = new byte[(length + 4)];
                C04470Nu.A03(i, bArr2, 0);
                System.arraycopy(bArr, 0, bArr2, 4, length);
                try {
                    r5.A0H(num.intValue(), bArr2);
                } catch (Exception e) {
                    C04790Pd.A00();
                    r6.A03(e, "Exception writing record", num.intValue(), length);
                    try {
                        r5.A0E();
                    } catch (Exception e2) {
                        C04790Pd.A00();
                        A01(r6, e2, "Exception resetting buffer");
                    }
                }
            }
        }
        return;
    }

    private synchronized void A03(Exception exc, String str, int i, int i2) {
        C04470Nu r1 = this.A04;
        if (r1 != null) {
            StringBuilder sb = new StringBuilder();
            r1.A0I(sb);
            sb.append(" record size: ");
            sb.append(i);
            sb.append(" space: ");
            sb.append(i2);
            HashMap hashMap = null;
            StringBuilder sb2 = new StringBuilder();
            int A0A2 = r1.A0A(sb2);
            if (A0A2 > 0) {
                hashMap = new HashMap();
                hashMap.put("buffer_operation_history", sb2.toString());
                hashMap.put("buffer_operation_history_count", Integer.toString(A0A2));
            }
            AnonymousClass0NW.A00((String) null, (String) null, (String) null, (String) null, str, sb.toString(), exc, hashMap);
        }
    }

    public final synchronized void A04(Object obj, Integer num) {
        char c = '!';
        C019809f r1 = this.A0B;
        if (r1 != null) {
            c = r1.A00(C019409a.A01(obj));
        }
        A02(this, AnonymousClass006.A01, (byte) c, (byte) C019909g.A00(num));
    }

    public final synchronized void Bzu(boolean z) {
        Integer num;
        short s;
        ScheduledExecutorService scheduledExecutorService;
        if (this.A08) {
            Boolean bool = this.A05;
            if (bool == null || bool.booleanValue() != z) {
                if (z) {
                    num = AnonymousClass006.A1L;
                } else {
                    num = AnonymousClass006.A02;
                }
                this.A05 = new Boolean(z);
                A02(this, num, new byte[0]);
                if (z && this.A07 == null && (s = this.A0H) > 0 && (scheduledExecutorService = this.A06) != null) {
                    long j = (long) s;
                    this.A07 = scheduledExecutorService.scheduleWithFixedDelay(this.A0G, j, j, TimeUnit.MILLISECONDS);
                }
            } else {
                A00(this);
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        A0J = hashMap;
        hashMap.put(100, 0);
        hashMap.put(125, 1);
        hashMap.put(130, 2);
        hashMap.put(150, 3);
        hashMap.put(200, 4);
        hashMap.put(230, 5);
        hashMap.put(300, 6);
        hashMap.put(325, 7);
        hashMap.put(350, 8);
        hashMap.put(400, 9);
        hashMap.put(500, 10);
        hashMap.put(1000, 11);
    }
}
