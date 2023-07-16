package X;

import android.content.Context;
import com.facebook.analytics2.logger.HandlerThreadFactory;
import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0Iy  reason: invalid class name and case insensitive filesystem */
public final class C03490Iy implements C02540Bv {
    public ByteArrayOutputStream A00;
    public boolean A01;
    public AnonymousClass0BX A02;
    public final AnonymousClass0AT A03;
    public final C02190Ae A04;
    public final C02590Ca A05;
    public final SamplingPolicyConfig A06;
    public final long A07;
    public final Context A08;
    public final HandlerThreadFactory A09;

    public C03490Iy(Context context, C02190Ae r6, AnonymousClass0LI r7, long j) {
        SamplingPolicyConfig samplingPolicyConfig;
        this.A08 = context;
        this.A04 = r6;
        this.A07 = j;
        try {
            C02200Af A002 = C02200Af.A00(context);
            this.A05 = (C02590Ca) C02200Af.A01(A002, r6.A01.getName(), A002.A04);
            Class cls = r6.A00;
            if (cls == null) {
                samplingPolicyConfig = null;
            } else {
                C02200Af A003 = C02200Af.A00(context);
                samplingPolicyConfig = (SamplingPolicyConfig) C02200Af.A02(A003, cls.getName(), A003.A02);
            }
            this.A06 = samplingPolicyConfig;
            this.A09 = C02200Af.A00(context).A04(r6.A02.getName());
            this.A03 = new AnonymousClass0AT(context, r7, samplingPolicyConfig, r6.A04);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(AnonymousClass00U.A0L("Failed to create instance of ", this.A04.A01.getName()), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(AnonymousClass00U.A0L("Failed to create instance of ", this.A04.A01.getName()), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(AnonymousClass00U.A0L("Failed to create instance of ", this.A04.A01.getName()), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(AnonymousClass00U.A0L("Failed to create instance of ", this.A04.A01.getName()), e4);
        }
    }

    private AnonymousClass0BX A00() {
        AnonymousClass0BX r1 = this.A02;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass0BX r12 = new AnonymousClass0BX(this.A09.AFM("Analytics-NormalPri-InMemory-Scheduler", 10).getLooper(), this);
        this.A02 = r12;
        return r12;
    }

    private void A01() {
        if (this.A00 == null) {
            throw new IllegalStateException("mByteArrayOutputStream is null");
        }
    }

    public final void BiM(String str) {
        if (this.A00 != null) {
            AnonymousClass0BX A002 = A00();
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            A002.removeMessages(1, byteArrayOutputStream);
            A002.sendMessage(A002.obtainMessage(1, byteArrayOutputStream));
        }
    }

    public final /* bridge */ /* synthetic */ void CmS(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) obj;
        if (this.A00 != byteArrayOutputStream) {
            this.A00 = byteArrayOutputStream;
            this.A01 = false;
        }
    }

    public final void D7i() {
        if (this.A00 != null) {
            AnonymousClass0BX A002 = A00();
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            A002.removeMessages(1, byteArrayOutputStream);
            A002.sendMessage(A002.obtainMessage(1, byteArrayOutputStream));
        }
    }

    public final void Bhx() {
        A01();
        AnonymousClass0BX A002 = A00();
        ByteArrayOutputStream byteArrayOutputStream = this.A00;
        A002.removeMessages(1, byteArrayOutputStream);
        A002.sendMessage(A002.obtainMessage(1, byteArrayOutputStream));
    }

    public final void Bi1() {
        A01();
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass0BX A002 = A00();
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            A002.sendMessageDelayed(A002.obtainMessage(1, byteArrayOutputStream), this.A07);
        }
    }

    public final void Bi2(long j) {
        A01();
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass0BX A002 = A00();
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            A002.sendMessageDelayed(A002.obtainMessage(1, byteArrayOutputStream), this.A07);
        }
    }

    public final void Bi3(long[] jArr, int i, int i2) {
        A01();
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass0BX A002 = A00();
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            A002.sendMessageDelayed(A002.obtainMessage(1, byteArrayOutputStream), this.A07);
        }
    }
}
