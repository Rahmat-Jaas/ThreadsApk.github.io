package X;

import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import java.lang.ref.WeakReference;

/* renamed from: X.0QU  reason: invalid class name */
public final class AnonymousClass0QU extends C016507v implements AnonymousClass0FA {
    public static final AnonymousClass0K9 A0C = new AnonymousClass0K9("DefaultFoundActivityLifecycleInfo");
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Object A05;
    public Object A06;
    public WeakReference A07 = null;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = false;
    public final AnonymousClass01Q A0B;

    public final boolean A06(Message message, C019509b r6) {
        boolean z = false;
        boolean z2 = true;
        try {
            this.A06 = r6.A03(1);
            this.A03 = r6.A02(1);
            this.A04 = r6.A02(2);
        } catch (AnonymousClass0KI e) {
            A0C.A03("Could not parse the given SomeArgs SomeArgs", e);
            this.A06 = null;
            z2 = false;
        }
        this.A02 = message.what;
        this.A05 = message.obj;
        this.A00 = message.arg1;
        this.A01 = message.arg2;
        if (z2) {
            z = true;
        }
        this.A08 = z;
        this.A0A = z2;
        return z2;
    }

    public AnonymousClass0QU(Parcelable parcelable, AnonymousClass01Q r10, AnonymousClass012 r11, C03190Eu r12, AnonymousClass0F0 r13, C03410If r14, Object obj) {
        super(r11, r12, r13, r14, ServerW3CShippingAddressConstants.DEFAULT, true);
        this.A04 = parcelable;
        this.A07 = obj;
        this.A0B = r10;
    }

    public final StringBuilder A04(StringBuilder sb, boolean z) {
        String str;
        sb.append(" Code: ");
        sb.append(this.A0B.A00());
        sb.append(" from ");
        if (this.A08) {
            sb.append("Message: [");
            sb.append("");
            sb.append(" what");
            sb.append(this.A02);
            sb.append("");
            sb.append(" obj");
            Object obj = this.A05;
            String str2 = "Null";
            String str3 = str2;
            if (obj != null) {
                str3 = obj.getClass().getName();
            }
            sb.append(str3);
            sb.append("");
            sb.append(" arg 1: ");
            sb.append(this.A00);
            sb.append("");
            sb.append(" arg 2: ");
            sb.append(this.A01);
            sb.append("");
            str = "]";
            sb.append(str);
            if (this.A0A) {
                sb.append("");
                sb.append(" And Also ");
                sb.append("");
                sb.append("Message Like: [");
                sb.append("");
                sb.append(" obj");
                Object obj2 = this.A06;
                if (obj2 != null) {
                    str2 = obj2.getClass().getName();
                }
                sb.append(str2);
                sb.append("");
                sb.append(" arg 1: ");
                sb.append(this.A03);
                sb.append("");
                sb.append(" arg 2: ");
                sb.append(this.A04);
                sb.append("");
            }
            return sb;
        } else if (this.A09) {
            str = "parcel";
        } else {
            str = "unknown or defaults";
        }
        sb.append(str);
        return sb;
    }

    public final boolean A05(Message message) {
        this.A02 = message.what;
        this.A05 = message.obj;
        this.A00 = message.arg1;
        this.A01 = message.arg2;
        this.A08 = true;
        return true;
    }

    public final boolean A07(Parcel parcel) {
        this.A07 = new WeakReference(parcel);
        this.A09 = true;
        return true;
    }

    public final boolean A08(Parcelable parcelable, Object obj) {
        return true;
    }
}
