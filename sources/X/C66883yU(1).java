package X;

import android.os.Bundle;
import com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenDismissCallback;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.3yU  reason: invalid class name and case insensitive filesystem */
public final class C66883yU implements C81864oW {
    public static final Integer A0F;
    public static final Integer A0G;
    public static final Integer A0H;
    public static final Integer A0I;
    public CdsOpenScreenDismissCallback A00;
    public final C81804oQ A01;
    public final AnonymousClass3HX A02;
    public final AnonymousClass601 A03;
    public final C127397h3 A04;
    public final C109326jp A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0154, code lost:
        if (r1 == false) goto L_0x0156;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C66883yU A02(X.AnonymousClass3HX r22, X.C127397h3 r23) {
        /*
            r9 = 0
            r13 = r23
            if (r23 == 0) goto L_0x0199
            int r8 = r13.A03
            r1 = 14059(0x36eb, float:1.9701E-41)
            java.lang.String r7 = "FULL_SHEET"
            r0 = 0
            r6 = 36
            r2 = 40
            r11 = r22
            if (r8 != r1) goto L_0x00bc
            boolean r5 = r13.A0T(r6, r0)
            java.lang.String r2 = r13.A0O(r2, r7)
            boolean r1 = r2.equals(r7)     // Catch:{ IllegalArgumentException -> 0x0035 }
            if (r1 == 0) goto L_0x0025
            java.lang.Integer r4 = X.AnonymousClass006.A00     // Catch:{ IllegalArgumentException -> 0x0035 }
            goto L_0x003d
        L_0x0025:
            java.lang.String r1 = "HALF_SHEET"
            boolean r1 = r2.equals(r1)     // Catch:{ IllegalArgumentException -> 0x0035 }
            if (r1 == 0) goto L_0x0030
            java.lang.Integer r4 = X.AnonymousClass006.A01     // Catch:{ IllegalArgumentException -> 0x0035 }
            goto L_0x003d
        L_0x0030:
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r2)     // Catch:{ IllegalArgumentException -> 0x0035 }
            throw r1     // Catch:{ IllegalArgumentException -> 0x0035 }
        L_0x0035:
            r2 = move-exception
            java.lang.String r1 = "CdsOpenScreenConfig"
            X.C30967GcS.A03(r1, r2)
            java.lang.Integer r4 = X.AnonymousClass006.A00
        L_0x003d:
            r1 = 46
            java.lang.String r3 = "NEVER_ANIMATED"
            java.lang.String r2 = r13.A0O(r1, r3)
            java.lang.String r1 = "ALWAYS_ANIMATED"
            boolean r1 = r2.equals(r1)     // Catch:{ IllegalArgumentException -> 0x0074 }
            if (r1 == 0) goto L_0x0050
            java.lang.Integer r2 = X.AnonymousClass006.A00     // Catch:{ IllegalArgumentException -> 0x0074 }
            goto L_0x007c
        L_0x0050:
            java.lang.String r1 = "DISABLED"
            boolean r1 = r2.equals(r1)     // Catch:{ IllegalArgumentException -> 0x0074 }
            if (r1 == 0) goto L_0x005b
            java.lang.Integer r2 = X.AnonymousClass006.A01     // Catch:{ IllegalArgumentException -> 0x0074 }
            goto L_0x007c
        L_0x005b:
            boolean r1 = r2.equals(r3)     // Catch:{ IllegalArgumentException -> 0x0074 }
            if (r1 == 0) goto L_0x0064
            java.lang.Integer r2 = X.AnonymousClass006.A0C     // Catch:{ IllegalArgumentException -> 0x0074 }
            goto L_0x007c
        L_0x0064:
            java.lang.String r1 = "ONLY_ANIMATED_WHILE_LOADING"
            boolean r1 = r2.equals(r1)     // Catch:{ IllegalArgumentException -> 0x0074 }
            if (r1 == 0) goto L_0x006f
            java.lang.Integer r2 = X.AnonymousClass006.A0N     // Catch:{ IllegalArgumentException -> 0x0074 }
            goto L_0x007c
        L_0x006f:
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r2)     // Catch:{ IllegalArgumentException -> 0x0074 }
            throw r1     // Catch:{ IllegalArgumentException -> 0x0074 }
        L_0x0074:
            r2 = move-exception
            java.lang.String r1 = "CdsOpenScreenConfig"
            X.C30967GcS.A03(r1, r2)
            java.lang.Integer r2 = X.AnonymousClass006.A0C
        L_0x007c:
            r1 = 42
            X.6jp r14 = r13.A0L(r1)
            if (r5 == 0) goto L_0x00b9
            java.lang.Integer r15 = X.AnonymousClass006.A0C
        L_0x0086:
            java.lang.Integer r3 = X.AnonymousClass006.A00
            r18 = r3
            if (r4 == r3) goto L_0x008e
            java.lang.Integer r3 = X.AnonymousClass006.A01
        L_0x008e:
            int r2 = r2.intValue()
            if (r2 == r0) goto L_0x00b6
            r1 = 1
            if (r2 == r1) goto L_0x00b3
            r1 = 3
            if (r2 == r1) goto L_0x00b0
            r17 = r18
        L_0x009c:
            X.3yU r8 = new X.3yU
            r10 = r9
            r12 = r9
            r19 = r9
            r20 = r9
            r21 = r0
            r22 = r0
            r23 = r0
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r8
        L_0x00b0:
            java.lang.Integer r17 = X.AnonymousClass006.A0C
            goto L_0x009c
        L_0x00b3:
            java.lang.Integer r17 = X.AnonymousClass006.A0Y
            goto L_0x009c
        L_0x00b6:
            java.lang.Integer r17 = X.AnonymousClass006.A01
            goto L_0x009c
        L_0x00b9:
            java.lang.Integer r15 = X.AnonymousClass006.A01
            goto L_0x0086
        L_0x00bc:
            r1 = 16085(0x3ed5, float:2.254E-41)
            r5 = 35
            r3 = 38
            java.lang.String r4 = "auto"
            if (r8 != r1) goto L_0x0124
            java.lang.String r1 = r13.A0O(r6, r4)
            java.lang.Integer r15 = X.AnonymousClass3QP.A00(r1)
            java.lang.String r1 = "full_sheet"
            java.lang.String r1 = r13.A0O(r3, r1)
            java.lang.Integer r16 = X.C62003Ws.A00(r1)
            java.lang.String r1 = "static"
            java.lang.String r7 = r13.A0O(r5, r1)
            java.lang.Integer[] r6 = X.AnonymousClass3QN.A00
            int r5 = r6.length
            r3 = 0
        L_0x00e2:
            if (r3 >= r5) goto L_0x00f3
            r17 = r6[r3]
            java.lang.String r1 = X.AnonymousClass3QN.A00(r17)
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0100
            int r3 = r3 + 1
            goto L_0x00e2
        L_0x00f3:
            java.lang.String r3 = "CdsOpenScreenConfig"
            java.lang.String r1 = "Error finding BackgroundMode enum value for: "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r7)
            X.C30967GcS.A02(r3, r1)
            java.lang.Integer r17 = X.AnonymousClass006.A00
        L_0x0100:
            r1 = 43
            java.lang.String r1 = r13.A0O(r1, r4)
            java.lang.Integer r18 = X.AnonymousClass3QO.A00(r1)
            X.6jp r14 = r13.A0L(r2)
            r1 = 48
            boolean r21 = r13.A0T(r1, r0)
            X.3yU r8 = new X.3yU
            r10 = r9
            r12 = r9
            r19 = r9
            r20 = r9
            r22 = r0
            r23 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r8
        L_0x0124:
            r1 = 16542(0x409e, float:2.318E-41)
            if (r8 != r1) goto L_0x0184
            java.lang.String r1 = r13.A0O(r5, r7)
            java.lang.Integer r16 = X.C62003Ws.A00(r1)
            java.lang.String r1 = r13.A0O(r3, r4)
            java.lang.Integer r15 = X.AnonymousClass3QP.A00(r1)
            java.lang.String r1 = "adjust_pan"
            java.lang.String r3 = r13.A0O(r2, r1)
            int r2 = r3.hashCode()
            r1 = -1009740956(0xffffffffc3d09364, float:-417.1515)
            if (r2 == r1) goto L_0x017b
            r1 = -205076707(0xfffffffff3c6c71d, float:-3.1497598E31)
            if (r2 != r1) goto L_0x0156
            java.lang.String r1 = "adjust_nothing"
            boolean r1 = r3.equals(r1)
            r2 = 48
        L_0x0154:
            if (r1 != 0) goto L_0x0158
        L_0x0156:
            r2 = 32
        L_0x0158:
            java.lang.Integer r19 = java.lang.Integer.valueOf(r2)
            r2 = 41
            java.lang.String r1 = "default"
            java.lang.String r1 = r13.A0O(r2, r1)
            java.lang.Integer r20 = X.C32272Bb.A00(r1)
            java.lang.Integer r17 = X.AnonymousClass006.A00
            X.3yU r8 = new X.3yU
            r10 = r9
            r12 = r9
            r14 = r9
            r18 = r17
            r21 = r0
            r22 = r0
            r23 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r8
        L_0x017b:
            java.lang.String r1 = "adjust_resize"
            boolean r1 = r3.equals(r1)
            r2 = 16
            goto L_0x0154
        L_0x0184:
            java.lang.String r2 = "CdsOpenScreenConfig"
            java.lang.String r0 = "Error matching OpenCDSSCreenConfig from options styleId: "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            r0 = 132(0x84, float:1.85E-43)
            X.7h3 r0 = r13.A0K(r0)
            java.lang.String r0 = X.C18200wM.A0m(r0, r1)
            X.C30967GcS.A02(r2, r0)
        L_0x0199:
            X.3yU r8 = A00()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66883yU.A02(X.3HX, X.7h3):X.3yU");
    }

    public static Object A03(Bundle bundle, Class cls, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        return C62533aC.A02(cls, Integer.valueOf(i));
    }

    public final int B91() {
        return 16542;
    }

    static {
        Integer num = AnonymousClass006.A00;
        A0G = num;
        A0H = num;
        A0F = num;
        A0I = num;
    }

    public static C66883yU A00() {
        return new C66883yU((C81804oQ) null, (CdsOpenScreenDismissCallback) null, (AnonymousClass3HX) null, (AnonymousClass601) null, (C127397h3) null, (C109326jp) null, A0G, A0H, A0F, A0I, (Integer) null, (Integer) null, false, false, false);
    }

    public static C66883yU A01(Bundle bundle) {
        Integer num;
        Bundle bundle2 = bundle;
        AnonymousClass601 r8 = (AnonymousClass601) A03(bundle2, AnonymousClass601.class, "bloks_interpreter_environment");
        AnonymousClass3HX r7 = (AnonymousClass3HX) A03(bundle2, AnonymousClass3HX.class, "bloks_context");
        C127397h3 r9 = (C127397h3) A03(bundle2, C127397h3.class, "bloks_model");
        Integer A002 = AnonymousClass3QP.A00(bundle2.getString("drag_to_dismiss", "auto"));
        Integer A003 = C62003Ws.A00(bundle2.getString(DatePickerDialogModule.ARG_MODE, "full_sheet"));
        String string = bundle2.getString("background_mode", "static");
        Integer[] numArr = AnonymousClass3QN.A00;
        int length = numArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                C30967GcS.A02("CdsOpenScreenConfig", AnonymousClass00U.A0L("Error finding BackgroundMode enum value for: ", string));
                num = AnonymousClass006.A00;
                break;
            }
            num = numArr[i];
            if (AnonymousClass3QN.A00(num).equals(string)) {
                break;
            }
            i++;
        }
        Integer A004 = AnonymousClass3QO.A00(bundle2.getString("dimmed_background_tap_to_dismiss", "static"));
        Integer A0T = C18210wN.A0T(bundle2, "keyboard_soft_input_mode");
        Integer A005 = C32272Bb.A00(bundle2.getString("animation_type", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT));
        CdsOpenScreenDismissCallback cdsOpenScreenDismissCallback = (CdsOpenScreenDismissCallback) A03(bundle2, CdsOpenScreenDismissCallback.class, "native_on_dismiss_callback");
        return new C66883yU((C81804oQ) A03(bundle2, C81804oQ.class, "custom_loading_view_resolver"), cdsOpenScreenDismissCallback, r7, r8, r9, (C109326jp) A03(bundle2, C109326jp.class, "on_dismiss_callback"), A002, A003, num, A004, A0T, A005, bundle2.getBoolean("clear_top_activity", false), bundle2.getBoolean("custom_loading_view_resolver", false), bundle2.getBoolean("native_disable_cancel_button_on_loading_screen", false));
    }

    public static void A04(Bundle bundle, Object obj, String str) {
        if (obj != null) {
            bundle.putInt(str, C62533aC.A00(obj));
        }
    }

    public C66883yU(C81804oQ r1, CdsOpenScreenDismissCallback cdsOpenScreenDismissCallback, AnonymousClass3HX r3, AnonymousClass601 r4, C127397h3 r5, C109326jp r6, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, boolean z, boolean z2, boolean z3) {
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A09 = num;
        this.A0B = num2;
        this.A07 = num3;
        this.A08 = num4;
        this.A0A = num5;
        this.A06 = num6;
        this.A05 = r6;
        this.A00 = cdsOpenScreenDismissCallback;
        this.A01 = r1;
        this.A0D = z2;
        this.A0C = z3;
        this.A0E = z;
    }

    public final Bundle A05() {
        String str;
        String str2;
        String str3;
        Bundle A062 = C18180wK.A06();
        switch (this.A09.intValue()) {
            case 1:
                str = "enabled";
                break;
            case 2:
                str = "disabled";
                break;
            default:
                str = "auto";
                break;
        }
        A062.putString("drag_to_dismiss", str);
        A062.putString(DatePickerDialogModule.ARG_MODE, C62003Ws.A01(this.A0B));
        A062.putString("background_mode", AnonymousClass3QN.A00(this.A07));
        switch (this.A08.intValue()) {
            case 1:
                str2 = "enabled";
                break;
            case 2:
                str2 = "disabled";
                break;
            default:
                str2 = "auto";
                break;
        }
        A062.putString("dimmed_background_tap_to_dismiss", str2);
        Integer num = this.A0A;
        if (num != null) {
            A062.putInt("keyboard_soft_input_mode", num.intValue());
        }
        Integer num2 = this.A06;
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str3 = "fade";
                    break;
                case 2:
                    str3 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                default:
                    str3 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                    break;
            }
            A062.putString("animation_type", str3);
        }
        A04(A062, this.A03, "bloks_interpreter_environment");
        A04(A062, this.A02, "bloks_context");
        A04(A062, this.A04, "bloks_model");
        A04(A062, this.A05, "on_dismiss_callback");
        A04(A062, this.A01, "custom_loading_view_resolver");
        A04(A062, this.A00, "native_on_dismiss_callback");
        A062.putBoolean("native_use_slide_animation_for_full_screen", this.A0D);
        A062.putBoolean("native_disable_cancel_button_on_loading_screen", this.A0C);
        A062.putBoolean("clear_top_activity", this.A0E);
        A062.setClassLoader(C66883yU.class.getClassLoader());
        return A062;
    }
}
