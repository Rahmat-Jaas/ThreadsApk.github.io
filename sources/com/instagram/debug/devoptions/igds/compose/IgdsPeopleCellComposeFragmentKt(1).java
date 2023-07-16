package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YM;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0ZV;
import X.AnonymousClass5I7;
import X.AnonymousClass74X;
import X.AnonymousClass7Ad;
import X.AnonymousClass7GN;
import X.AnonymousClass7JR;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7Kq;
import X.AnonymousClass7W3;
import X.AnonymousClass7WO;
import X.AnonymousClass7WR;
import X.C121747Hv;
import X.C122847Ub;
import X.C123327Wm;
import X.C146288ly;
import X.C146798ms;
import X.C147178nW;
import X.C147188nY;
import X.C147368pE;
import X.C18170wI;
import X.C86104wH;
import X.C98236Es;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

public final class IgdsPeopleCellComposeFragmentKt {
    public static final void IgdsPeopleCellExamples(User user, C147188nY r99, int i) {
        C147188nY r9 = r99;
        r9.Cvd(394766022);
        C122847Ub A00 = AnonymousClass7Ad.A00(r9);
        C123327Wm r0 = Modifier.A00;
        Modifier A01 = AnonymousClass7Ad.A01(A00, Modifier.A04(r0));
        C146288ly A05 = AnonymousClass7KV.A05(r9);
        Object A0p = C147188nY.A0p(r9);
        Object A0n = C147188nY.A0n(r9);
        Object A0m = C147188nY.A0m(r9);
        AnonymousClass0ZU r1 = AnonymousClass74X.A00;
        AnonymousClass0YM A002 = C98236Es.A00(A01);
        AnonymousClass7W3 r4 = (AnonymousClass7W3) r9;
        C147188nY.A0w(r9, r4, r1);
        AnonymousClass7W3.A0a(r9, r4, A05, A0p);
        Integer A0l = C147188nY.A0l(r9, AnonymousClass7KP.A01(r9, A0n, A0m), A002);
        r9.Cvb(1322492944);
        User user2 = user;
        ImageUrl B4M = user2.B4M();
        List A1O = user2.A1O();
        if (A1O == null) {
            A1O = AnonymousClass0ZV.A00;
        }
        String BK7 = user2.BK7();
        String A11 = user2.A11();
        if (A11 == null) {
            A11 = user2.Ak1();
        }
        C121747Hv.A00(r9, (Modifier) null, B4M, (C146798ms) null, (AnonymousClass5I7) null, BK7, A11, user2.A1I(), (AnonymousClass0ZU) null, (AnonymousClass0YY) null, (AnonymousClass0YM) null, 0, 0, 15972, false, false, user2.BZi(), A1O.contains(A0l));
        C121747Hv.A00(r9, (Modifier) null, B4M, (C146798ms) null, (AnonymousClass5I7) null, "primary_text_only", (String) null, (String) null, (AnonymousClass0ZU) null, (AnonymousClass0YY) null, (AnonymousClass0YM) null, 48, 0, 16380, false, false, false, false);
        C121747Hv.A00(r9, (Modifier) null, B4M, (C146798ms) null, (AnonymousClass5I7) null, "primary_text_verified", (String) null, (String) null, (AnonymousClass0ZU) null, (AnonymousClass0YY) null, (AnonymousClass0YM) null, 12582960, 0, 16252, false, false, true, false);
        C121747Hv.A00(r9, (Modifier) null, B4M, (C146798ms) null, (AnonymousClass5I7) null, "primary_text_internal", (String) null, (String) null, (AnonymousClass0ZU) null, (AnonymousClass0YY) null, (AnonymousClass0YM) null, 100663344, 0, 16124, false, false, false, true);
        C121747Hv.A00(r9, (Modifier) null, B4M, (C146798ms) null, (AnonymousClass5I7) null, "primary_text_internal", (String) null, (String) null, (AnonymousClass0ZU) null, (AnonymousClass0YY) null, (AnonymousClass0YM) null, 113246256, 0, 15996, false, false, true, true);
        String A003 = C18170wI.A00(1302);
        C121747Hv.A00(r9, (Modifier) null, B4M, (C146798ms) null, (AnonymousClass5I7) null, A003, "secondary_text", (String) null, (AnonymousClass0ZU) null, (AnonymousClass0YY) null, (AnonymousClass0YM) null, 3120, 0, 16372, false, false, false, false);
        C121747Hv.A00(r9, (Modifier) null, B4M, (C146798ms) null, (AnonymousClass5I7) null, A003, "verified", (String) null, (AnonymousClass0ZU) null, (AnonymousClass0YY) null, (AnonymousClass0YM) null, 12586032, 0, 16244, false, false, true, false);
        C147188nY r29 = r9;
        ImageUrl imageUrl = B4M;
        C121747Hv.A00(r29, (Modifier) null, imageUrl, (C146798ms) null, (AnonymousClass5I7) null, A003, "verified and internal", (String) null, (AnonymousClass0ZU) null, (AnonymousClass0YY) null, (AnonymousClass0YM) null, 113249328, 0, 15988, false, false, true, true);
        C121747Hv.A00(r29, (Modifier) null, imageUrl, (C146798ms) null, (AnonymousClass5I7) null, "Ellipsize test for very long primary text that should overflow", "Ellipsize test for very long secondary text that should overflow", "Ellipsize test for very long tertiary text that should overflow since there is bunch of gibberish text that is meant to take up space", (AnonymousClass0ZU) null, (AnonymousClass0YY) null, (AnonymousClass0YM) null, 27696, 0, 16356, false, false, false, false);
        C121747Hv.A00(r29, (Modifier) null, imageUrl, (C146798ms) null, (AnonymousClass5I7) null, "Verified ellipsize test for very long primary text that should overflow", "Verified ellipsize test for very long secondary text that should overflow", "Verified ellipsize test for very long tertiary text that should overflow since there is bunch of gibberish text that is meant to take up space", (AnonymousClass0ZU) null, (AnonymousClass0YY) null, (AnonymousClass0YM) null, 12610608, 0, 16228, false, false, true, false);
        C121747Hv.A00(r29, (Modifier) null, imageUrl, (C146798ms) null, (AnonymousClass5I7) null, "Internal ellipsize test for very long primary text that should overflow", "Internal ellipsize test for very long secondary text that should overflow", "Internal ellipsize test for very long tertiary text that should overflow since there is bunch of gibberish text that is meant to take up space", (AnonymousClass0ZU) null, (AnonymousClass0YY) null, (AnonymousClass0YM) null, 100690992, 0, 16100, false, false, false, true);
        C121747Hv.A00(r29, (Modifier) null, imageUrl, (C146798ms) null, (AnonymousClass5I7) null, "Verified Internal ellipsize test for very long primary text that should overflow", "Verified Internal ellipsize test for very long secondary text that should overflow", "Verified Internal ellipsize test for very long tertiary text that should overflow since there is bunch of gibberish text that is meant to take up space", (AnonymousClass0ZU) null, (AnonymousClass0YY) null, (AnonymousClass0YM) null, 113273904, 0, 15972, false, false, true, true);
        Object A0r = C147188nY.A0r(r9, r4, -492369756);
        Object obj = AnonymousClass7GN.A00;
        if (A0r == obj) {
            A0r = AnonymousClass7WR.A00(r4, false);
        }
        AnonymousClass7W3.A0w(r4, false);
        C147368pE r3 = (C147368pE) A0r;
        boolean A0y = C147188nY.A0y(r9, r3);
        Object A13 = r4.A13();
        if (A0y || A13 == obj) {
            A13 = new IgdsPeopleCellComposeFragmentKt$IgdsPeopleCellExamples$1$profileClick$1$1(r3);
            r4.A14(A13);
        }
        AnonymousClass0YY A0A = AnonymousClass7W3.A0A(r4, A13, false);
        C121747Hv.A00(r29, (Modifier) null, imageUrl, (C146798ms) null, (AnonymousClass5I7) null, "primary text", "has gradient spinner", "tertiary text", (AnonymousClass0ZU) null, A0A, (AnonymousClass0YM) null, 224304, 0, 12164, true, C86104wH.A1X(r3), false, false);
        C121747Hv.A00(r9, (Modifier) null, B4M, (C146798ms) null, (AnonymousClass5I7) null, "verified primary text", "has gradient spinner", "tertiary text", (AnonymousClass0ZU) null, A0A, (AnonymousClass0YM) null, 12807216, 0, 12036, true, C86104wH.A1X(r3), true, false);
        Modifier A0A2 = AnonymousClass7Kq.A0A(r0, (float) 112);
        C147188nY r45 = r9;
        ImageUrl imageUrl2 = B4M;
        String str = "primary text";
        AnonymousClass0YY r54 = A0A;
        C121747Hv.A00(r45, (Modifier) null, imageUrl2, (C146798ms) null, (AnonymousClass5I7) null, str, "with follow button", (String) null, (AnonymousClass0ZU) null, r54, AnonymousClass7JR.A00(r9, new IgdsPeopleCellComposeFragmentKt$IgdsPeopleCellExamples$1$1(A0A2), 1888935278), 199728, 3072, 3988, true, C86104wH.A1X(r3), false, false);
        C147188nY r58 = r9;
        ImageUrl imageUrl3 = B4M;
        String str2 = "with follow button";
        AnonymousClass0YY r67 = A0A;
        String str3 = "verified primary text";
        C121747Hv.A00(r58, (Modifier) null, imageUrl3, (C146798ms) null, (AnonymousClass5I7) null, str3, str2, (String) null, (AnonymousClass0ZU) null, r67, AnonymousClass7JR.A00(r9, new IgdsPeopleCellComposeFragmentKt$IgdsPeopleCellExamples$1$2(A0A2), -2103144627), 12782640, 3072, 3860, true, C86104wH.A1X(r3), true, false);
        C147188nY r70 = r9;
        ImageUrl imageUrl4 = B4M;
        String str4 = "with follow button";
        AnonymousClass0YY r79 = A0A;
        C121747Hv.A00(r70, (Modifier) null, imageUrl4, (C146798ms) null, (AnonymousClass5I7) null, "internal primary text", str4, (String) null, (AnonymousClass0ZU) null, r79, AnonymousClass7JR.A00(r9, new IgdsPeopleCellComposeFragmentKt$IgdsPeopleCellExamples$1$3(A0A2), -1800257236), 100863024, 3072, 3732, true, C86104wH.A1X(r3), false, true);
        C147188nY r16 = r9;
        ImageUrl imageUrl5 = B4M;
        String str5 = "with follow button";
        AnonymousClass0YY r25 = A0A;
        C121747Hv.A00(r16, (Modifier) null, imageUrl5, (C146798ms) null, (AnonymousClass5I7) null, "verified internal primary text", str5, (String) null, (AnonymousClass0ZU) null, r25, AnonymousClass7JR.A00(r9, new IgdsPeopleCellComposeFragmentKt$IgdsPeopleCellExamples$1$4(A0A2), -1497369845), 113445936, 3072, 3604, true, C86104wH.A1X(r3), true, true);
        AnonymousClass5I7 r20 = AnonymousClass5I7.A05;
        C121747Hv.A00(r16, (Modifier) null, imageUrl5, (C146798ms) null, r20, "dense_style", (String) null, (String) null, (AnonymousClass0ZU) null, (AnonymousClass0YY) null, (AnonymousClass0YM) null, 48, 0, 15868, false, false, false, false);
        C147188nY r82 = r9;
        ImageUrl imageUrl6 = B4M;
        AnonymousClass5I7 r86 = r20;
        C121747Hv.A00(r82, (Modifier) null, imageUrl6, (C146798ms) null, r86, "dense_style_verified", (String) null, (String) null, (AnonymousClass0ZU) null, (AnonymousClass0YY) null, (AnonymousClass0YM) null, 12582960, 0, 15740, false, false, true, false);
        C121747Hv.A00(r82, (Modifier) null, imageUrl6, (C146798ms) null, r86, "dense_style_internal", (String) null, (String) null, (AnonymousClass0ZU) null, (AnonymousClass0YY) null, (AnonymousClass0YM) null, 100663344, 0, 15612, false, false, false, true);
        C121747Hv.A00(r16, (Modifier) null, imageUrl5, (C146798ms) null, r20, "dense_style", "secondary text", (String) null, (AnonymousClass0ZU) null, (AnonymousClass0YY) null, (AnonymousClass0YM) null, 3120, 0, 15860, false, false, false, false);
        C121747Hv.A00(r16, (Modifier) null, imageUrl5, (C146798ms) null, r20, "dense_style", "verified", (String) null, (AnonymousClass0ZU) null, (AnonymousClass0YY) null, (AnonymousClass0YM) null, 12586032, 0, 15732, false, false, true, false);
        C121747Hv.A00(r16, (Modifier) null, imageUrl5, (C146798ms) null, r20, "dense_style", "has gradient spinner", (String) null, (AnonymousClass0ZU) null, A0A, (AnonymousClass0YM) null, 199728, 0, 11668, true, C86104wH.A1X(r3), false, false);
        AnonymousClass5I7 r49 = r20;
        String str6 = "dense_style";
        C121747Hv.A00(r45, (Modifier) null, imageUrl2, (C146798ms) null, r49, str6, "with follow button", (String) null, (AnonymousClass0ZU) null, r54, AnonymousClass7JR.A00(r9, new IgdsPeopleCellComposeFragmentKt$IgdsPeopleCellExamples$1$5(A0A2), -1606457489), 199728, 3072, 3476, true, C86104wH.A1X(r3), false, false);
        C147188nY r292 = r9;
        ImageUrl imageUrl7 = B4M;
        AnonymousClass5I7 r33 = r20;
        String str7 = "dense_style_internal";
        String str8 = "with follow button";
        C121747Hv.A00(r292, (Modifier) null, imageUrl7, (C146798ms) null, r33, str7, str8, (String) null, (AnonymousClass0ZU) null, A0A, AnonymousClass7JR.A00(r9, new IgdsPeopleCellComposeFragmentKt$IgdsPeopleCellExamples$1$6(A0A2), -1303570098), 100863024, 3072, 3220, true, C86104wH.A1X(r3), false, true);
        C147188nY r582 = r9;
        ImageUrl imageUrl8 = B4M;
        AnonymousClass5I7 r62 = r20;
        String str9 = "dense_style";
        C121747Hv.A00(r582, (Modifier) null, imageUrl8, (C146798ms) null, r62, str9, "verified with follow button", (String) null, (AnonymousClass0ZU) null, r67, AnonymousClass7JR.A00(r9, new IgdsPeopleCellComposeFragmentKt$IgdsPeopleCellExamples$1$7(A0A2), -1000682707), 12782640, 3072, 3348, true, C86104wH.A1X(r3), true, false);
        AnonymousClass7W3.A0v(r4, true);
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new IgdsPeopleCellComposeFragmentKt$IgdsPeopleCellExamples$2(user2, i));
        }
    }

    public static final boolean IgdsPeopleCellExamples$lambda$4$lambda$1(C147368pE r0) {
        return C86104wH.A1X(r0);
    }

    public static final void IgdsPeopleCellExamples$lambda$4$lambda$2(C147368pE r0, boolean z) {
        C147368pE.A04(r0, z);
    }
}
