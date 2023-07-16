package com.instagram.appreciation.gifting;

import X.AnonymousClass006;
import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass1jA;
import X.AnonymousClass1jB;
import X.AnonymousClass22b;
import X.AnonymousClass2FT;
import X.AnonymousClass3Zw;
import X.AnonymousClass4WJ;
import X.AnonymousClass7EX;
import X.AnonymousClass7pP;
import X.C04220Ms;
import X.C109056jO;
import X.C11630kW;
import X.C122017Jn;
import X.C13330nS;
import X.C146958n9;
import X.C18190wL;
import X.C18220wO;
import X.C18720xk;
import X.C19573AyZ;
import X.C38040KHr;
import X.C39142Kno;
import X.C62903b6;
import X.C63733iD;
import X.C86104wH;
import X.C89195Ch;
import X.D0E;
import X.H4Q;
import android.text.SpannableStringBuilder;
import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.KtLambdaShape0S7101000_I2;

@DebugMetadata(c = "com.instagram.appreciation.gifting.AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1", f = "AppreciationGiftingBottomSheetFragment.kt", i = {0, 0, 0}, l = {500}, m = "invokeSuspend", n = {"logger", "bugReporter", "errorSnackBarEvent"}, s = {"L$0", "L$1", "L$2"})
public final class AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ List A0F;
    public final /* synthetic */ int A0G;
    public final /* synthetic */ ImageUrl A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1(ImageUrl imageUrl, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, C146958n9 r14, int i, int i2) {
        super(2, r14);
        this.A05 = userSession;
        this.A0E = str;
        this.A0B = str2;
        this.A06 = str3;
        this.A08 = str4;
        this.A0C = str5;
        this.A07 = str6;
        this.A09 = str7;
        this.A0G = i;
        this.A0H = imageUrl;
        this.A0A = str8;
        this.A04 = i2;
        this.A0F = list;
        this.A0D = str9;
    }

    public final C146958n9 create(Object obj, C146958n9 r18) {
        UserSession userSession = this.A05;
        String str = this.A0E;
        String str2 = this.A0B;
        String str3 = this.A06;
        String str4 = this.A08;
        String str5 = this.A0C;
        String str6 = this.A07;
        String str7 = this.A09;
        int i = this.A0G;
        ImageUrl imageUrl = this.A0H;
        String str8 = this.A0A;
        int i2 = this.A04;
        return new AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1(imageUrl, userSession, str, str2, str3, str4, str5, str6, str7, str8, this.A0D, this.A0F, r18, i, i2);
    }

    public static H4Q A00(AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1 appreciationGiftingBottomSheetFragment$doOptimisticGifting$1, CharSequence charSequence, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        AnonymousClass3Zw.A00(spannableStringBuilder, new C18720xk(appreciationGiftingBottomSheetFragment$doOptimisticGifting$1.A0G), str);
        C63733iD r1 = new C63733iD();
        r1.A0E(AnonymousClass22b.SQUARE);
        r1.A0A = spannableStringBuilder;
        r1.A06 = appreciationGiftingBottomSheetFragment$doOptimisticGifting$1.A0H;
        return new H4Q(r1.A0B());
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass7EX r1;
        AnonymousClass7pP A002;
        H4Q A003;
        Object obj2 = obj;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            A003 = (H4Q) this.A03;
            A002 = (AnonymousClass7pP) this.A02;
            r1 = (AnonymousClass7EX) this.A01;
            AnonymousClass0OU.A00(obj2);
        } else {
            AnonymousClass0OU.A00(obj2);
            UserSession userSession = this.A05;
            String str = this.A0E;
            String str2 = this.A0B;
            r1 = new AnonymousClass7EX(new LoggingFanData(str, str2, this.A06, this.A08), (C11630kW) null, userSession);
            A002 = AnonymousClass2FT.A00().A00(userSession);
            C109056jO r7 = new C109056jO(new AppreciationGiftingDataSource(userSession), str, this.A0C);
            A003 = A00(this, this.A09, this.A07);
            String str3 = this.A0A;
            int i = this.A04;
            List list = this.A0F;
            AnonymousClass0wJ.A1M(str3, 0, list);
            C89195Ch A012 = AnonymousClass7EX.A01(r1, AnonymousClass006.A01, (Integer) null, str3, i);
            A012.A0B("gift_options", list);
            C13330nS r4 = r1.A02;
            C04220Ms.A05(r4);
            C86104wH.A1I(AnonymousClass0wJ.A0M(r4, "client_load_appreciationgiver_init"), A012, r1.A01.A03, AnonymousClass4WJ.A0A(), 255);
            this.A01 = r1;
            this.A02 = A002;
            this.A03 = A003;
            this.A00 = 1;
            obj2 = r7.A00.A00(str3, str2, r7.A01, r7.A02, this);
            if (obj2 == d0e) {
                return d0e;
            }
        }
        C62903b6 r42 = (C62903b6) obj2;
        if (r42 instanceof AnonymousClass1jA) {
            if (AnonymousClass0wJ.A1X(((AnonymousClass1jA) r42).A00)) {
                C38040KHr.A01.CWx(A00(this, this.A0D, this.A07));
                String str4 = this.A0A;
                int i2 = this.A04;
                List list2 = this.A0F;
                AnonymousClass0wJ.A1M(str4, 0, list2);
                C89195Ch A013 = AnonymousClass7EX.A01(r1, AnonymousClass006.A01, (Integer) null, str4, i2);
                A013.A0B("gift_options", list2);
                C122017Jn.A01(A013, r1);
            } else {
                String userId = this.A05.getUserId();
                String str5 = this.A06;
                String str6 = this.A0E;
                String str7 = this.A0C;
                String str8 = this.A0B;
                String str9 = this.A0A;
                int i3 = this.A04;
                boolean A1Z = AnonymousClass0wJ.A1Z("IgResult is success but the server return false", userId);
                AnonymousClass0wJ.A1Q(str5, str6);
                C18190wL.A1S(str7, 4, str8);
                C04220Ms.A0B(str9, 6);
                KtLambdaShape0S7101000_I2 ktLambdaShape0S7101000_I2 = new KtLambdaShape0S7101000_I2(A002, str6, str7, userId, str8, "IgResult is success but the server return false", str5, str9, i3, A1Z ? 1 : 0);
                if (C19573AyZ.A02(A002.A00)) {
                    ktLambdaShape0S7101000_I2.invoke();
                }
                r1.A03(str9, "spending_gift_result_failure", (String) null, this.A0F, i3);
                C38040KHr.A01.CWx(A003);
            }
        } else if (r42 instanceof AnonymousClass1jB) {
            String str10 = (String) ((AnonymousClass1jB) r42).A00;
            String userId2 = this.A05.getUserId();
            String str11 = this.A06;
            String str12 = this.A0E;
            String str13 = this.A0C;
            String str14 = this.A0B;
            String str15 = this.A0A;
            int i4 = this.A04;
            boolean A1Z2 = AnonymousClass0wJ.A1Z(str10, userId2);
            AnonymousClass0wJ.A1Q(str11, str12);
            C18190wL.A1S(str13, 4, str14);
            C04220Ms.A0B(str15, 6);
            KtLambdaShape0S7101000_I2 ktLambdaShape0S7101000_I22 = new KtLambdaShape0S7101000_I2(A002, str12, str13, userId2, str14, str10, str11, str15, i4, A1Z2 ? 1 : 0);
            if (C19573AyZ.A02(A002.A00)) {
                ktLambdaShape0S7101000_I22.invoke();
            }
            r1.A03(str15, "spending_gift_network_failure", str10, this.A0F, i4);
            C38040KHr.A01.CWx(A003);
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
