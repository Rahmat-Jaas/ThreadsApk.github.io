package X;

import android.os.Build;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.io.IOException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.0Ao  reason: invalid class name and case insensitive filesystem */
public abstract class C02290Ao {
    public AnonymousClass0AY A00;
    public AnonymousClass0AZ A01;
    public C02280An A02;
    public final int A03;
    public final int A04;
    public final ByteBuffer A05;
    public final Queue A06 = new LinkedList();
    public final Set A07 = new HashSet();
    public final char[] A08;
    public final AnonymousClass0AU A09;
    public final AnonymousClass0LI A0A;

    public abstract C02280An A06(C02280An r1, String str);

    public abstract Object A07();

    public final C02280An A01() {
        int incrementAndGet;
        C02280An r0 = this.A02;
        if (r0 == null || !r0.A01.A0B(this)) {
            A02();
            C02280An A062 = A06(this.A02, (String) null);
            this.A02 = A062;
            try {
                C02150Aa r02 = A062.A02;
                AnonymousClass0AU r2 = this.A09;
                C02150Aa.A00(r02);
                Writer writer = r02.A02;
                AnonymousClass0KD A022 = r2.A01.A02();
                AnonymousClass07C.A01("writeFixedData");
                try {
                    AnonymousClass0KD.A00(A022, Long.valueOf(System.currentTimeMillis()), "time");
                    AnonymousClass0U5 r6 = r2.A02;
                    AnonymousClass0KD.A00(A022, r6.AQz(), "app_id");
                    AnonymousClass0KD.A00(A022, r6.AR3(), "app_ver");
                    AnonymousClass0KD.A00(A022, Integer.valueOf(r6.AR4()), "build_num");
                    AnonymousClass0KD.A00(A022, 0L, "consent_state");
                    AnonymousClass0KD.A00(A022, Build.MODEL, "device");
                    AnonymousClass0KD.A00(A022, Build.VERSION.RELEASE, "os_ver");
                    AnonymousClass0KD.A00(A022, r2.A03.AO7(), AnonymousClass00T.A00(0, 9, 90));
                    AnonymousClass0U8 r22 = r2.A04;
                    if (r22.AO7() != null) {
                        AnonymousClass0KD.A00(A022, r22.AO7(), "family_device_id");
                    }
                    AnonymousClass0KR.A00().A05(A022, writer);
                    A022.A02();
                    AnonymousClass07C.A00();
                    C02150Aa r03 = this.A02.A02;
                    AnonymousClass0AZ r23 = this.A01;
                    C02150Aa.A00(r03);
                    Writer writer2 = r03.A02;
                    AnonymousClass0LI r62 = r23.A01;
                    A022 = r62.A02();
                    AnonymousClass07C.A01("writeNewSessionData");
                    String A002 = AnonymousClass00T.A00(9, 10, 118);
                    AnonymousClass0AY r24 = r23.A00;
                    AnonymousClass0KD.A00(A022, r24.A01, A002);
                    synchronized (r24) {
                        incrementAndGet = AnonymousClass0AY.A02.incrementAndGet();
                    }
                    AnonymousClass0KD.A00(A022, Integer.valueOf(incrementAndGet), "seq");
                    AnonymousClass0IU r04 = r24.A00;
                    if (r04 == null) {
                        AnonymousClass0KD.A00(A022, (Object) null, FXPFAccessLibraryDebugFragment.UID);
                    } else {
                        r04.A00(A022, r62);
                    }
                    AnonymousClass0KR.A00().A05(A022, writer2);
                    A022.A02();
                    AnonymousClass07C.A00();
                } catch (Throwable th) {
                    A022.A02();
                    AnonymousClass07C.A00();
                    throw th;
                }
            } catch (IOException e) {
                this.A02.A01.A08(this);
                A02();
                throw e;
            }
        }
        return this.A02;
    }

    public final void A02() {
        C02280An r1 = this.A02;
        if (r1 == null) {
            return;
        }
        if (this.A01 != null) {
            try {
                r1.A03.close();
                r1.A01.A03();
            } catch (IOException unused) {
            }
            this.A02 = null;
            return;
        }
        throw new IllegalStateException("mBatchSessionMetadataHelper is null");
    }

    public final void A03(AnonymousClass0AY r3) {
        this.A00 = r3;
        this.A01 = new AnonymousClass0AZ(r3, this.A0A);
        C02280An r1 = this.A02;
        if (r1 != null) {
            try {
                r1.A03.close();
                r1.A01.A03();
            } catch (IOException unused) {
            }
            this.A02 = null;
        }
    }

    public final void A04(AnonymousClass0LH r5) {
        if (this.A01 != null) {
            C02280An A012 = A01();
            if (A012 == null) {
                this.A06.add(r5);
                return;
            }
            while (true) {
                try {
                    Queue queue = this.A06;
                    if (!queue.isEmpty()) {
                        A012.A02.A01((AnonymousClass0LH) queue.poll());
                        A012.A00++;
                    } else {
                        A012.A02.A01(r5);
                        A012.A03.flush();
                        A012.A00++;
                        return;
                    }
                } finally {
                    A012.A01.A08(this);
                }
            }
        } else {
            throw new IllegalStateException("mBatchSessionMetadataHelper is null");
        }
    }

    public final void A05(AnonymousClass0LH[] r5, int i, int i2) {
        if (this.A01 != null) {
            C02280An A012 = A01();
            if (A012 == null) {
                int i3 = i2 + i;
                while (i < i3) {
                    this.A06.add(r5[i]);
                    i++;
                }
                return;
            }
            while (true) {
                try {
                    Queue queue = this.A06;
                    if (queue.isEmpty()) {
                        break;
                    }
                    A012.A02.A01((AnonymousClass0LH) queue.poll());
                    A012.A00++;
                } finally {
                    A012.A01.A08(this);
                }
            }
            C02150Aa r2 = A012.A02;
            int i4 = i2 + i;
            if (r5.length < i4) {
                throw new IllegalArgumentException();
            }
            while (i < i4) {
                r2.A01(r5[i]);
                i++;
            }
            A012.A03.flush();
            A012.A00 += i2;
            return;
        }
        throw new IllegalStateException("mBatchSessionMetadataHelper is null");
    }

    public C02290Ao(AnonymousClass0AG r4, AnonymousClass0AU r5, AnonymousClass0LI r6, int i, int i2, int i3) {
        if (i <= i2) {
            this.A04 = i;
            this.A03 = i2;
            i3 = i3 <= 0 ? 1024 : i3;
            this.A08 = new char[i3];
            this.A05 = ByteBuffer.allocate(i3 << 1);
            this.A09 = r5;
            this.A0A = r6;
            this.A01 = new AnonymousClass0AZ(new AnonymousClass0AY((AnonymousClass0IU) null, r4.CYD()), r6);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass00U.A0K(" > ", i, i2));
    }
}
