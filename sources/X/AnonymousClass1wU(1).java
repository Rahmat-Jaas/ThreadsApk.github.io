package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0200000_I2_7;
import kotlin.jvm.internal.KtLambdaShape115S0100000_I2_95;
import kotlin.jvm.internal.KtLambdaShape33S0200000_I2_17;

/* renamed from: X.1wU  reason: invalid class name */
public final class AnonymousClass1wU extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "EndToEndEncryptionFragment";
    public final C04530Oa A00 = C80644m9.A00(this);
    public final C04530Oa A01;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0054, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (r0 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        r0 = r4.getString(r0.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        r1.A04 = r0;
        r2.add(r1);
        r4 = r3.A00;
        r6 = r4.A00;
        r1 = r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        if (r6.isMarkerOn(r1) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0075, code lost:
        r6.markerStart(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0086, code lost:
        switch(((X.C23899D0m) r7.A04().getValue()).ordinal()) {
            case 0: goto L_0x0096;
            case 1: goto L_0x0096;
            case 2: goto L_0x0096;
            case 3: goto L_0x0093;
            case 4: goto L_0x0090;
            case 5: goto L_0x0096;
            default: goto L_0x0089;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
        throw X.AnonymousClass4VZ.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        r1 = "DEVICE_ONBOARDED";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0093, code lost:
        r1 = "DEVICE_NOT_ONBOARDED";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        r1 = "NO_BACKUPS_PRESENT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        r4.A03("INITIAL_BACKUP_STATUS", r1);
        r4.A03("SOURCE", "IG_SETTINGS");
        r4.A03("LOGGED_IN_ACCOUNTS", java.lang.String.valueOf(r5.multipleAccountHelper.A0B()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r8 = this;
            X.0Oa r0 = r8.A01
            java.lang.Object r3 = r0.getValue()
            X.104 r3 = (X.AnonymousClass104) r3
            android.content.Context r4 = r8.requireContext()
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            com.instagram.service.session.UserSession r5 = r3.A02
            X.49L r0 = X.AnonymousClass2MV.A00(r5)
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00b3
            r6 = 2131826835(0x7f111893, float:1.9286566E38)
            r0 = 237(0xed, float:3.32E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r3, r0)
            X.3Xk r1 = new X.3Xk
            r1.<init>((android.view.View.OnClickListener) r0, (int) r6)
            r0 = 2131232771(0x7f080803, float:1.808166E38)
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
            if (r0 == 0) goto L_0x0035
            r1.A02 = r0
        L_0x0035:
            X.EAB r7 = r3.A01
            X.4wG r0 = r7.A04()
            java.lang.Object r0 = r0.getValue()
            X.D0m r0 = (X.C23899D0m) r0
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x008e;
                case 1: goto L_0x008e;
                case 2: goto L_0x004d;
                case 3: goto L_0x004d;
                case 4: goto L_0x0051;
                case 5: goto L_0x008e;
                default: goto L_0x0048;
            }
        L_0x0048:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x004d:
            r0 = 2131826836(0x7f111894, float:1.9286568E38)
            goto L_0x0054
        L_0x0051:
            r0 = 2131826837(0x7f111895, float:1.928657E38)
        L_0x0054:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x008e
            int r0 = r0.intValue()
            java.lang.String r0 = r4.getString(r0)
        L_0x0062:
            r1.A04 = r0
            r2.add(r1)
            X.1oS r4 = r3.A00
            X.01V r6 = r4.A00
            int r1 = r4.A00()
            boolean r0 = r6.isMarkerOn(r1)
            if (r0 != 0) goto L_0x0078
            r6.markerStart(r1)
        L_0x0078:
            X.4wG r0 = r7.A04()
            java.lang.Object r0 = r0.getValue()
            X.D0m r0 = (X.C23899D0m) r0
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0096;
                case 1: goto L_0x0096;
                case 2: goto L_0x0096;
                case 3: goto L_0x0093;
                case 4: goto L_0x0090;
                case 5: goto L_0x0096;
                default: goto L_0x0089;
            }
        L_0x0089:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x008e:
            r0 = 0
            goto L_0x0062
        L_0x0090:
            java.lang.String r1 = "DEVICE_ONBOARDED"
            goto L_0x0098
        L_0x0093:
            java.lang.String r1 = "DEVICE_NOT_ONBOARDED"
            goto L_0x0098
        L_0x0096:
            java.lang.String r1 = "NO_BACKUPS_PRESENT"
        L_0x0098:
            java.lang.String r0 = "INITIAL_BACKUP_STATUS"
            r4.A03(r0, r1)
            java.lang.String r1 = "SOURCE"
            java.lang.String r0 = "IG_SETTINGS"
            r4.A03(r1, r0)
            X.0BO r0 = r5.multipleAccountHelper
            int r0 = r0.A0B()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "LOGGED_IN_ACCOUNTS"
            r4.A03(r0, r1)
        L_0x00b3:
            X.H7n r0 = X.AnonymousClass3WI.A00(r5)
            X.4UE r0 = r0.A0F
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x00d8
            r1 = 2131826838(0x7f111896, float:1.9286572E38)
            r0 = 238(0xee, float:3.34E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r3, r0)
            X.4MA r1 = X.AnonymousClass4MA.A00(r0, r1)
            r0 = 2131232230(0x7f0805e6, float:1.8080563E38)
            r1.A01 = r0
            r2.add(r1)
        L_0x00d8:
            r8.setItems(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1wU.A00():void");
    }

    public final void afterOnViewCreated() {
        C18180wK.A18(this, new KtSLambdaShape12S0200000_I2_7((Object) this, (C146958n9) null, 31), ((AnonymousClass104) this.A01.getValue()).A04);
    }

    public final void configureActionBar(AnonymousClass4u2 r20) {
        AnonymousClass4u2 r3 = r20;
        if (r20 != null) {
            r3.Cqb(2131826839);
            r3.CtT(true);
            r3.Cro(new C24758DYo(C63393hP.A01(requireActivity(), R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color), (ColorFilter) null, (Drawable) null, (Drawable) null, (View.OnClickListener) null, AnonymousClass006.A00, -2, -2, -2, -2, -2, -2, -2, true));
            return;
        }
        throw C18190wL.A0a("Required value was null.");
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public AnonymousClass1wU() {
        KtLambdaShape115S0100000_I2_95 ktLambdaShape115S0100000_I2_95 = new KtLambdaShape115S0100000_I2_95(this, 41);
        C04530Oa A0l = C18240wQ.A0l(AnonymousClass006.A0C, new KtLambdaShape115S0100000_I2_95(this, 38), 39);
        this.A01 = C18220wO.A0M(new KtLambdaShape115S0100000_I2_95(A0l, 40), ktLambdaShape115S0100000_I2_95, new KtLambdaShape33S0200000_I2_17(49, (Object) null, A0l), C18210wN.A0l(AnonymousClass104.class));
    }

    public final void onResume() {
        int A02 = C14030oh.A02(2071836307);
        super.onResume();
        A00();
        ((AnonymousClass104) this.A01.getValue()).A00.A01(AnonymousClass006.A00);
        C14030oh.A09(2105925971, A02);
    }
}
