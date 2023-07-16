package X;

import android.content.Context;

/* renamed from: X.196  reason: invalid class name */
public final class AnonymousClass196 extends AnonymousClass0Sf implements C41882MfV {
    public final Context A00;
    public final AnonymousClass33O A01;
    public final C30131zs A02;
    public final Boolean A03;
    public final Integer A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass196) {
                AnonymousClass196 r5 = (AnonymousClass196) obj;
                if (!C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AnonymousClass196(Context context, AnonymousClass33O r3, Boolean bool, Integer num) {
        C30131zs r0 = C30131zs.AVATAR_SEE_MORE;
        this.A04 = num;
        this.A03 = bool;
        this.A00 = context;
        this.A01 = r3;
        this.A02 = r0;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(2131821763);
    }

    public final int hashCode() {
        Context context = this.A00;
        return C18220wO.A06(this.A02, (AnonymousClass0wJ.A05(context, (AnonymousClass0wJ.A05(this.A04, 1661965213) + AnonymousClass0wJ.A03(this.A03)) * 31) + C18200wM.A07(this.A01)) * 31);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
