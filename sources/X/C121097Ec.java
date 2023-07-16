package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.instagram.barcelona.R;

/* renamed from: X.7Ec  reason: invalid class name and case insensitive filesystem */
public final class C121097Ec {
    public static void A00(Context context, Drawable drawable, C121097Ec r4, int i) {
        int A03 = r4.A03(context, i);
        C04220Ms.A0B(drawable, 1);
        drawable.setTint(A03);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r0 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r1 = com.instagram.barcelona.R.color.default_cta_dominate_color;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r0 != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        r1 = com.instagram.barcelona.R.color.canvas_bottom_sheet_description_text_color;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        r1 = com.instagram.barcelona.R.color.igds_primary_text;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r1 = com.instagram.barcelona.R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_normal_text_color;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        r1 = com.instagram.barcelona.R.color.igds_error_or_destructive;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        r1 = com.instagram.barcelona.R.color.igds_separator;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0083, code lost:
        r1 = com.instagram.barcelona.R.color.igds_success;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008b, code lost:
        r1 = com.instagram.barcelona.R.color.igds_loading_shimmer_light;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009f, code lost:
        return r3.getColor(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = com.instagram.barcelona.R.color.igds_status_pill_ripple;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A03(android.content.Context r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            X.C04220Ms.A0B(r3, r0)
            switch(r4) {
                case 0: goto L_0x0045;
                case 1: goto L_0x0049;
                case 2: goto L_0x004d;
                case 3: goto L_0x0051;
                case 4: goto L_0x0055;
                case 5: goto L_0x0059;
                case 6: goto L_0x005d;
                case 7: goto L_0x0041;
                case 8: goto L_0x0061;
                case 9: goto L_0x0065;
                case 10: goto L_0x0069;
                case 11: goto L_0x0077;
                case 12: goto L_0x0034;
                case 13: goto L_0x0051;
                case 14: goto L_0x0051;
                case 15: goto L_0x0038;
                case 16: goto L_0x0034;
                case 17: goto L_0x0049;
                case 18: goto L_0x007b;
                case 19: goto L_0x007f;
                case 20: goto L_0x008b;
                case 21: goto L_0x0083;
                case 22: goto L_0x004d;
                case 23: goto L_0x0077;
                case 24: goto L_0x0049;
                case 25: goto L_0x0051;
                case 26: goto L_0x0087;
                case 27: goto L_0x0049;
                case 28: goto L_0x0051;
                case 29: goto L_0x0065;
                default: goto L_0x0007;
            }
        L_0x0007:
            switch(r4) {
                case 34: goto L_0x0045;
                case 35: goto L_0x0027;
                case 36: goto L_0x0023;
                case 37: goto L_0x007f;
                default: goto L_0x000a;
            }
        L_0x000a:
            switch(r4) {
                case 41: goto L_0x005d;
                case 42: goto L_0x0051;
                case 43: goto L_0x0051;
                case 44: goto L_0x0034;
                case 45: goto L_0x001b;
                case 46: goto L_0x0041;
                case 47: goto L_0x001f;
                default: goto L_0x000d;
            }
        L_0x000d:
            switch(r4) {
                case 56: goto L_0x0023;
                case 57: goto L_0x002b;
                case 58: goto L_0x0045;
                case 59: goto L_0x008b;
                case 60: goto L_0x007f;
                case 61: goto L_0x007f;
                case 62: goto L_0x008f;
                case 63: goto L_0x0083;
                case 64: goto L_0x007f;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.String r0 = "Invalid color type: "
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r4)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x001b:
            r1 = 2131100110(0x7f0601ce, float:1.7812592E38)
            goto L_0x009b
        L_0x001f:
            r1 = 2131099866(0x7f0600da, float:1.7812097E38)
            goto L_0x009b
        L_0x0023:
            r1 = 2131100113(0x7f0601d1, float:1.7812598E38)
            goto L_0x009b
        L_0x0027:
            r1 = 2131099963(0x7f06013b, float:1.7812294E38)
            goto L_0x009b
        L_0x002b:
            boolean r0 = X.C34822La.A00(r3)
            r1 = 2131099833(0x7f0600b9, float:1.781203E38)
            if (r0 == 0) goto L_0x009b
        L_0x0034:
            r1 = 2131099843(0x7f0600c3, float:1.781205E38)
            goto L_0x009b
        L_0x0038:
            boolean r0 = X.C34822La.A00(r3)
            r1 = 2131099823(0x7f0600af, float:1.781201E38)
            if (r0 == 0) goto L_0x009b
        L_0x0041:
            r1 = 2131099740(0x7f06005c, float:1.7811842E38)
            goto L_0x009b
        L_0x0045:
            r1 = 2131100092(0x7f0601bc, float:1.7812556E38)
            goto L_0x009b
        L_0x0049:
            r1 = 2131100109(0x7f0601cd, float:1.781259E38)
            goto L_0x009b
        L_0x004d:
            r1 = 2131100064(0x7f0601a0, float:1.7812499E38)
            goto L_0x009b
        L_0x0051:
            r1 = 2131099962(0x7f06013a, float:1.7812292E38)
            goto L_0x009b
        L_0x0055:
            r1 = 2131099941(0x7f060125, float:1.781225E38)
            goto L_0x009b
        L_0x0059:
            r1 = 2131100082(0x7f0601b2, float:1.7812535E38)
            goto L_0x009b
        L_0x005d:
            r1 = 2131100067(0x7f0601a3, float:1.7812505E38)
            goto L_0x009b
        L_0x0061:
            r1 = 2131100089(0x7f0601b9, float:1.781255E38)
            goto L_0x009b
        L_0x0065:
            r1 = 2131100091(0x7f0601bb, float:1.7812554E38)
            goto L_0x009b
        L_0x0069:
            r0 = 2131100091(0x7f0601bb, float:1.7812554E38)
            int r1 = r3.getColor(r0)
            r0 = 77
            int r0 = X.C31163GhW.A06(r1, r0)
            return r0
        L_0x0077:
            r1 = 2131100071(0x7f0601a7, float:1.7812513E38)
            goto L_0x009b
        L_0x007b:
            r1 = 2131100068(0x7f0601a4, float:1.7812507E38)
            goto L_0x009b
        L_0x007f:
            r1 = 2131100111(0x7f0601cf, float:1.7812594E38)
            goto L_0x009b
        L_0x0083:
            r1 = 2131100117(0x7f0601d5, float:1.7812606E38)
            goto L_0x009b
        L_0x0087:
            r1 = 2131099961(0x7f060139, float:1.781229E38)
            goto L_0x009b
        L_0x008b:
            r1 = 2131100085(0x7f0601b5, float:1.7812541E38)
            goto L_0x009b
        L_0x008f:
            boolean r0 = X.C34822La.A00(r3)
            r1 = 2131099682(0x7f060022, float:1.7811724E38)
            if (r0 == 0) goto L_0x009b
            r1 = 2131099851(0x7f0600cb, float:1.7812067E38)
        L_0x009b:
            int r0 = r3.getColor(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121097Ec.A03(android.content.Context, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0228, code lost:
        r1 = A03(r4, r6);
        r2.mutate();
        r2.setColorFilter(r1, android.graphics.PorterDuff.Mode.SRC_IN);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0234, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0251, code lost:
        r2.setTint(A03(r4, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0258, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable A04(android.content.Context r4, int r5, int r6) {
        /*
            r3 = this;
            r0 = 2
            X.C04220Ms.A0B(r4, r0)
            java.lang.String r1 = "Required value was null."
            switch(r5) {
                case 0: goto L_0x0014;
                case 1: goto L_0x0022;
                case 2: goto L_0x0030;
                case 3: goto L_0x003e;
                case 4: goto L_0x004c;
                case 5: goto L_0x005a;
                case 6: goto L_0x0068;
                case 7: goto L_0x0076;
                case 8: goto L_0x0009;
                case 9: goto L_0x004c;
                case 10: goto L_0x0009;
                case 11: goto L_0x0084;
                case 12: goto L_0x0092;
                case 13: goto L_0x00a0;
                case 14: goto L_0x00ae;
                case 15: goto L_0x00bc;
                case 16: goto L_0x00ca;
                case 17: goto L_0x00d8;
                case 18: goto L_0x00e6;
                case 19: goto L_0x00f4;
                case 20: goto L_0x0102;
                case 21: goto L_0x0009;
                case 22: goto L_0x0110;
                case 23: goto L_0x011e;
                case 24: goto L_0x012c;
                case 25: goto L_0x013a;
                case 26: goto L_0x0009;
                case 27: goto L_0x0009;
                case 28: goto L_0x0148;
                case 29: goto L_0x0009;
                case 30: goto L_0x0156;
                case 31: goto L_0x0164;
                case 32: goto L_0x0172;
                case 33: goto L_0x0009;
                case 34: goto L_0x003e;
                case 35: goto L_0x0180;
                case 36: goto L_0x0009;
                case 37: goto L_0x018e;
                case 38: goto L_0x019c;
                case 39: goto L_0x0009;
                case 40: goto L_0x01aa;
                case 41: goto L_0x004c;
                case 42: goto L_0x0009;
                case 43: goto L_0x01b8;
                case 44: goto L_0x01c6;
                case 45: goto L_0x01d4;
                case 46: goto L_0x01e2;
                case 47: goto L_0x01f0;
                case 48: goto L_0x01fe;
                case 49: goto L_0x020c;
                case 50: goto L_0x0009;
                case 51: goto L_0x021a;
                case 52: goto L_0x0235;
                case 53: goto L_0x0243;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r0 = "Invalid icon type: "
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r5)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0014:
            r0 = 2131232424(0x7f0806a8, float:1.8080957E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0022:
            r0 = 2131232268(0x7f08060c, float:1.808064E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0030:
            r0 = 2131232761(0x7f0807f9, float:1.808164E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x003e:
            r0 = 2131232767(0x7f0807ff, float:1.8081653E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x004c:
            r0 = 2131232762(0x7f0807fa, float:1.8081642E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x005a:
            r0 = 2131232861(0x7f08085d, float:1.8081843E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0068:
            r0 = 2131232451(0x7f0806c3, float:1.8081012E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0076:
            r0 = 2131232460(0x7f0806cc, float:1.808103E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0084:
            r0 = 2131232603(0x7f08075b, float:1.808132E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0092:
            r0 = 2131231688(0x7f0803c8, float:1.8079464E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x00a0:
            r0 = 2131232463(0x7f0806cf, float:1.8081036E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x00ae:
            r0 = 2131232980(0x7f0808d4, float:1.8082085E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x00bc:
            r0 = 2131232864(0x7f080860, float:1.808185E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0234
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x00ca:
            r0 = 2131232983(0x7f0808d7, float:1.808209E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0234
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x00d8:
            r0 = 2131232931(0x7f0808a3, float:1.8081985E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0234
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x00e6:
            r0 = 2131232771(0x7f080803, float:1.808166E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0234
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x00f4:
            r0 = 2131232903(0x7f080887, float:1.8081928E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0234
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0102:
            r0 = 2131233204(0x7f0809b4, float:1.8082539E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0110:
            r0 = 2131232860(0x7f08085c, float:1.8081841E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0234
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x011e:
            r0 = 2131233487(0x7f080acf, float:1.8083113E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0234
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x012c:
            r0 = 2131232443(0x7f0806bb, float:1.8080995E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x013a:
            r0 = 2131232451(0x7f0806c3, float:1.8081012E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0148:
            r0 = 2131233486(0x7f080ace, float:1.808311E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0234
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0156:
            r0 = 2131233008(0x7f0808f0, float:1.8082141E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0164:
            r0 = 2131232751(0x7f0807ef, float:1.808162E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0172:
            r0 = 2131232535(0x7f080717, float:1.8081182E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0180:
            r0 = 2131231390(0x7f08029e, float:1.807886E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0234
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x018e:
            r0 = 2131233245(0x7f0809dd, float:1.8082622E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0234
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x019c:
            r0 = 2131232862(0x7f08085e, float:1.8081845E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x01aa:
            r0 = 2131233495(0x7f080ad7, float:1.808313E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0234
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x01b8:
            r0 = 2131232407(0x7f080697, float:1.8080922E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0228
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x01c6:
            r0 = 2131232430(0x7f0806ae, float:1.808097E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x01d4:
            r0 = 2131232468(0x7f0806d4, float:1.8081046E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x01e2:
            r0 = 2131232462(0x7f0806ce, float:1.8081034E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x01f0:
            r0 = 2131232570(0x7f08073a, float:1.8081253E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0228
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x01fe:
            r0 = 2131233494(0x7f080ad6, float:1.8083127E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0234
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x020c:
            r0 = 2131231353(0x7f080279, float:1.8078785E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0234
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x021a:
            r0 = 2131232440(0x7f0806b8, float:1.808099E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0228
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0228:
            int r1 = r3.A03(r4, r6)
            r2.mutate()
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
        L_0x0234:
            return r2
        L_0x0235:
            r0 = 2131232996(0x7f0808e4, float:1.8082117E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0243:
            r0 = 2131232771(0x7f080803, float:1.808166E38)
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r0)
            if (r2 != 0) goto L_0x0251
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0251:
            int r0 = r3.A03(r4, r6)
            r2.setTint(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121097Ec.A04(android.content.Context, int, int):android.graphics.drawable.Drawable");
    }

    public static void A01(Context context, ImageView imageView, C121097Ec r2, int i, int i2) {
        imageView.setImageDrawable(r2.A04(context, i, i2));
    }

    public final int A02(int i) {
        switch (i) {
            case 0:
                return R.style.FBPayUIListCell;
            case 1:
                return R.style.FBPayUIListCellLeftAddOnLabel;
            case 2:
                return R.style.FBPayUIButton;
            case 3:
                return R.style.FBPayUINavigationBar;
            case 4:
                return R.style.FBPayUIPriceTable;
            case 5:
                return 2131886515;
            case 6:
                return 2131886572;
            case 7:
                return 2131886571;
            case 8:
                return R.style.FbPayProgressSpinner;
            case 9:
                return R.style.FbPayUIPayButtonAnimation;
            case 10:
                return R.style.FBPayUITextButtonBackground;
            case 11:
                return R.style.FbPayUICheckbox;
            case 13:
                return R.style.FbpayNuxContinueButtonStyle;
            case 14:
                return 2131886577;
            case 15:
                return R.style.FbpayBannerPrimaryTextStyle;
            case 16:
                return R.style.FbPayFulfillmentOptionsListStyle;
            case LangUtils.HASH_SEED /*17*/:
                return 2131886547;
            case 18:
                return R.style.FbpayFormSaveButtonStyle;
            case 19:
                return R.style.FbpayFormContainerStyle;
            case 20:
                return R.style.FbpayFormContainerElevatedStyle;
            case 22:
                return R.style.FbpayNUXFormContainerElevatedStyle;
            case 23:
                return R.style.FbpayStickyFooterNuxContinueButtonStyle;
            case 24:
                return R.style.FbPayNuxFormLayoutStyle;
            case 25:
                return R.style.FbPayAccordionStyle;
            case Rfc3492Idn.tmax /*26*/:
                return 2131886588;
            case 27:
                return 2131886589;
            case 28:
                return R.style.FbPayListSelectionComponent;
            default:
                return R.style.FBPayAnimationButtonContainer;
        }
    }
}
