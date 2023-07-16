package X;

import android.view.View;

/* renamed from: X.19A  reason: invalid class name */
public final class AnonymousClass19A extends AnonymousClass0Sf implements C41882MfV {
    public final View.OnClickListener A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass19A) && C04220Ms.A0I(this.A00, ((AnonymousClass19A) obj).A00));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C04220Ms.A0B(obj, 0);
        return true;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ViewModel(textRes=");
        A0s.append(2131828926);
        A0s.append(", tapListener=");
        A0s.append(this.A00);
        A0s.append(", detailText=");
        A0s.append((String) null);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public /* synthetic */ AnonymousClass19A(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return 2131828926;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A00, 1662187266);
    }
}
