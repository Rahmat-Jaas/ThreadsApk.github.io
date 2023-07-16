package X;

import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.4Js  reason: invalid class name and case insensitive filesystem */
public final class C71674Js implements C39586KwJ {
    public IgTextView A00;
    public IgTextView A01;
    public AnonymousClass19S A02;
    public boolean A03;

    public static final void A00(C71674Js r3) {
        String str;
        String str2;
        IgTextView igTextView = r3.A00;
        if (igTextView == null) {
            str2 = "primaryButtonView";
        } else {
            AnonymousClass19S r0 = r3.A02;
            String str3 = "";
            if (r0 != null) {
                str = r0.A01;
            } else {
                str = str3;
            }
            igTextView.setText(str);
            IgTextView igTextView2 = r3.A01;
            if (igTextView2 == null) {
                str2 = "secondaryButtonView";
            } else {
                AnonymousClass19S r02 = r3.A02;
                if (r02 != null) {
                    str3 = r02.A02;
                }
                igTextView2.setText(str3);
                return;
            }
        }
        C04220Ms.A0E(str2);
        throw null;
    }

    public final /* bridge */ /* synthetic */ void AAP(C81674oB r3) {
        AnonymousClass19S r32 = (AnonymousClass19S) r3;
        C04220Ms.A0B(r32, 0);
        this.A02 = r32;
        if (this.A03) {
            A00(this);
            throw new NullPointerException("getValue");
        }
    }
}
