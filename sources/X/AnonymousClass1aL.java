package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.service.session.UserSession;

/* renamed from: X.1aL  reason: invalid class name */
public final class AnonymousClass1aL extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "PromoteSimpleErrorFragment";
    public View A00;
    public TextView A01;
    public TextView A02;
    public ErrorIdentifier A03;
    public IgdsBottomButtonLayout A04;
    public UserSession A05;

    public final void configureActionBar(AnonymousClass4u2 r3) {
        Context A0A = C18240wQ.A0A(this, r3, 0);
        ErrorIdentifier errorIdentifier = this.A03;
        if (errorIdentifier == null) {
            C04220Ms.A0E("errorIdentifier");
            throw null;
        }
        r3.setTitle(AnonymousClass2KQ.A00(A0A, errorIdentifier));
        AnonymousClass4u2.A06(r3);
    }

    public final String getModuleName() {
        return "promote_simple_error";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00df, code lost:
        r2.setPrimaryAction(r1, X.C18190wL.A0H(r8, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e7, code lost:
        r6 = "errorViewTitle";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0187, code lost:
        r1.setPrimaryActionOnClickListener(X.C18190wL.A0H(r8, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018f, code lost:
        X.C04220Ms.A0E("errorViewDescription");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r0 = 0
            X.C04220Ms.A0B(r9, r0)
            super.onViewCreated(r9, r10)
            r0 = 2131304939(0x7f0921eb, float:1.8228035E38)
            android.view.View r1 = r9.requireViewById(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewStub"
            X.C04220Ms.A0C(r1, r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            android.view.View r1 = r1.inflate()
            X.C04220Ms.A06(r1)
            r8.A00 = r1
            java.lang.String r7 = "errorView"
            r0 = 2131304940(0x7f0921ec, float:1.8228037E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.A02 = r0
            android.view.View r1 = r8.A00
            if (r1 == 0) goto L_0x0194
            r0 = 2131304937(0x7f0921e9, float:1.822803E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.A01 = r0
            r0 = 2131296482(0x7f0900e2, float:1.8210882E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r9, r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r0
            r8.A04 = r0
            X.C18200wM.A1F(r8)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r8.A04
            java.lang.String r6 = "buttonView"
            if (r1 == 0) goto L_0x005a
            r0 = 2131833465(0x7f113279, float:1.9300013E38)
            X.C18210wN.A15(r8, r1, r0)
            com.instagram.api.schemas.ErrorIdentifier r0 = r8.A03
            if (r0 != 0) goto L_0x005f
            java.lang.String r6 = "errorIdentifier"
        L_0x005a:
            X.C04220Ms.A0E(r6)
        L_0x005d:
            r0 = 0
            throw r0
        L_0x005f:
            int r0 = r0.ordinal()
            java.lang.String r3 = "\n\n"
            java.lang.String r5 = "errorViewDescription"
            switch(r0) {
                case 9: goto L_0x00eb;
                case 10: goto L_0x010a;
                case 11: goto L_0x007e;
                case 12: goto L_0x00af;
                case 13: goto L_0x006a;
                case 14: goto L_0x006a;
                case 15: goto L_0x006a;
                case 16: goto L_0x006a;
                case 17: goto L_0x006a;
                case 18: goto L_0x006a;
                case 19: goto L_0x0174;
                case 20: goto L_0x0158;
                default: goto L_0x006a;
            }
        L_0x006a:
            android.widget.TextView r1 = r8.A02
            if (r1 == 0) goto L_0x00e7
            r0 = 2131833468(0x7f11327c, float:1.9300019E38)
            r1.setText(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r8.A04
            if (r1 == 0) goto L_0x005a
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x007e:
            android.widget.TextView r1 = r8.A02
            if (r1 == 0) goto L_0x00e7
            r0 = 2131833063(0x7f1130e7, float:1.9299197E38)
            r1.setText(r0)
            r0 = 2131833060(0x7f1130e4, float:1.9299191E38)
            java.lang.String r2 = r8.getString(r0)
            r0 = 2131833061(0x7f1130e5, float:1.9299193E38)
            java.lang.String r0 = r8.getString(r0)
            android.widget.TextView r1 = r8.A01
            if (r1 == 0) goto L_0x018f
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r3, r0)
            r1.setText(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r8.A04
            if (r2 == 0) goto L_0x005a
            r0 = 2131833062(0x7f1130e6, float:1.9299195E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 213(0xd5, float:2.98E-43)
            goto L_0x00df
        L_0x00af:
            android.widget.TextView r1 = r8.A02
            if (r1 == 0) goto L_0x00e7
            r0 = 2131833063(0x7f1130e7, float:1.9299197E38)
            r1.setText(r0)
            r0 = 2131833162(0x7f11314a, float:1.9299398E38)
            java.lang.String r2 = r8.getString(r0)
            r0 = 2131833163(0x7f11314b, float:1.92994E38)
            java.lang.String r0 = r8.getString(r0)
            android.widget.TextView r1 = r8.A01
            if (r1 == 0) goto L_0x018f
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r3, r0)
            r1.setText(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r8.A04
            if (r2 == 0) goto L_0x005a
            r0 = 2131833062(0x7f1130e6, float:1.9299195E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 214(0xd6, float:3.0E-43)
        L_0x00df:
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r8, r0)
            r2.setPrimaryAction(r1, r0)
            return
        L_0x00e7:
            java.lang.String r6 = "errorViewTitle"
            goto L_0x005a
        L_0x00eb:
            r8.A01()
            android.widget.TextView r1 = r8.A01
            if (r1 == 0) goto L_0x018f
            java.lang.CharSequence r0 = r8.A00()
            r1.setText(r0)
            android.widget.TextView r0 = r8.A01
            if (r0 == 0) goto L_0x018f
            X.C18180wK.A0z(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r8.A04
            if (r1 == 0) goto L_0x005a
            r0 = 211(0xd3, float:2.96E-43)
            X.AnonymousClass0wJ.A16(r1, r0, r8)
            return
        L_0x010a:
            r8.A01()
            android.widget.TextView r4 = r8.A01
            if (r4 == 0) goto L_0x018f
            r0 = 2131833455(0x7f11326f, float:1.9299993E38)
            java.lang.String r3 = X.C18180wK.A0g(r8, r0)
            r0 = 2131833454(0x7f11326e, float:1.929999E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r8, r3, r0)
            X.C04220Ms.A06(r0)
            android.text.SpannableStringBuilder r2 = X.C18200wM.A0E(r0)
            android.view.View r0 = r8.A00
            if (r0 == 0) goto L_0x0194
            android.content.Context r1 = r0.getContext()
            r0 = 2130971027(0x7f040993, float:1.755078E38)
            int r1 = X.C18220wO.A02(r1, r0)
            r0 = 10
            X.C18720xk.A00(r2, r8, r3, r1, r0)
            r4.setText(r2)
            android.widget.TextView r0 = r8.A01
            if (r0 == 0) goto L_0x018f
            X.C18180wK.A0z(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r8.A04
            if (r1 == 0) goto L_0x005a
            r0 = 212(0xd4, float:2.97E-43)
            X.AnonymousClass0wJ.A16(r1, r0, r8)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r8.A04
            if (r1 == 0) goto L_0x005a
            r0 = 2131833460(0x7f113274, float:1.9300003E38)
            X.C18210wN.A15(r8, r1, r0)
            return
        L_0x0158:
            r8.A01()
            android.widget.TextView r1 = r8.A01
            if (r1 == 0) goto L_0x018f
            java.lang.CharSequence r0 = r8.A00()
            r1.setText(r0)
            android.widget.TextView r0 = r8.A01
            if (r0 == 0) goto L_0x018f
            X.C18180wK.A0z(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r8.A04
            if (r1 == 0) goto L_0x005a
            r0 = 215(0xd7, float:3.01E-43)
            goto L_0x0187
        L_0x0174:
            r8.A01()
            android.widget.TextView r1 = r8.A01
            if (r1 == 0) goto L_0x018f
            r0 = 2131833458(0x7f113272, float:1.9299999E38)
            r1.setText(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r8.A04
            if (r1 == 0) goto L_0x005a
            r0 = 216(0xd8, float:3.03E-43)
        L_0x0187:
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r8, r0)
            r1.setPrimaryActionOnClickListener(r0)
            return
        L_0x018f:
            X.C04220Ms.A0E(r5)
            goto L_0x005d
        L_0x0194:
            X.C04220Ms.A0E(r7)
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1aL.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A01() {
        TextView textView = this.A02;
        if (textView == null) {
            C04220Ms.A0E("errorViewTitle");
            throw null;
        } else {
            textView.setText(2131833467);
        }
    }

    public final C10300i6 getSession() {
        UserSession userSession = this.A05;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    private final CharSequence A00() {
        String A0g = C18180wK.A0g(this, 2131833455);
        String A0o = AnonymousClass0wJ.A0o(this, A0g, 2131833456);
        C04220Ms.A06(A0o);
        SpannableStringBuilder A0E = C18200wM.A0E(A0o);
        View view = this.A00;
        if (view == null) {
            C04220Ms.A0E("errorView");
            throw null;
        }
        C18720xk.A00(A0E, this, A0g, C18220wO.A02(view.getContext(), R.attr.textColorRegularLink), 11);
        return A0E;
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = C14030oh.A02(-294018745);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A05 = C18180wK.A0V(bundle2);
            String string = bundle2.getString("error_type");
            if (string != null) {
                ErrorIdentifier errorIdentifier = (ErrorIdentifier) ErrorIdentifier.A01.get(string);
                if (errorIdentifier == null) {
                    errorIdentifier = ErrorIdentifier.UNRECOGNIZED;
                }
                this.A03 = errorIdentifier;
                C14030oh.A09(-978966291, A022);
                return;
            }
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = -2122825350;
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = -39734461;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1397784179);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.promote_error_view, false);
        C14030oh.A09(2143316020, A022);
        return A0D;
    }
}
