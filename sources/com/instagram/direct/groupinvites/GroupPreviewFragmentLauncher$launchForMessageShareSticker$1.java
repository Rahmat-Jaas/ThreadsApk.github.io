package com.instagram.direct.groupinvites;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass1dV;
import X.AnonymousClass2NZ;
import X.AnonymousClass4Bg;
import X.C04220Ms;
import X.C11630kW;
import X.C1372486y;
import X.C146958n9;
import X.C18180wK;
import X.C18210wN;
import X.C18220wO;
import X.C18330wh;
import X.C25731op;
import X.C25752DrO;
import X.C28461uL;
import X.C307522u;
import X.C31014GdU;
import X.C35132Mf;
import X.C37032Jj9;
import X.C37383Jqm;
import X.C39142Kno;
import X.C63813iO;
import X.C81434nn;
import X.D0E;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCallbackShape48S0400000_1_I2;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.service.session.UserSession;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0301000_I2_6;
import kotlin.coroutines.jvm.internal.KtSLambdaShape25S0201000_I2;

@DebugMetadata(c = "com.instagram.direct.groupinvites.GroupPreviewFragmentLauncher$launchForMessageShareSticker$1", f = "GroupPreviewFragmentLauncher.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
public final class GroupPreviewFragmentLauncher$launchForMessageShareSticker$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C11630kW A02;
    public final /* synthetic */ C28461uL A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C18330wh A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ AnonymousClass0ZU A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupPreviewFragmentLauncher$launchForMessageShareSticker$1(FragmentActivity fragmentActivity, C11630kW r3, C28461uL r4, UserSession userSession, C18330wh r6, String str, String str2, String str3, C146958n9 r10, AnonymousClass0ZU r11, boolean z) {
        super(2, r10);
        this.A03 = r4;
        this.A04 = userSession;
        this.A08 = str;
        this.A06 = str2;
        this.A0A = z;
        this.A01 = fragmentActivity;
        this.A05 = r6;
        this.A02 = r3;
        this.A07 = str3;
        this.A09 = r11;
    }

    public final C146958n9 create(Object obj, C146958n9 r14) {
        C28461uL r3 = this.A03;
        UserSession userSession = this.A04;
        String str = this.A08;
        String str2 = this.A06;
        boolean z = this.A0A;
        return new GroupPreviewFragmentLauncher$launchForMessageShareSticker$1(this.A01, this.A02, r3, userSession, this.A05, str, str2, this.A07, r14, this.A09, z);
    }

    public final Object invokeSuspend(Object obj) {
        C307522u r1;
        Object obj2 = obj;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj2);
        } else {
            AnonymousClass0OU.A00(obj2);
            C1372486y r0 = new C1372486y(new KtSLambdaShape14S0301000_I2_6(this.A03.A02, new KtSLambdaShape25S0201000_I2(17, (C146958n9) null), (C146958n9) null, 17));
            this.A00 = 1;
            obj2 = C25752DrO.A04(this, r0);
            if (obj2 == d0e) {
                return d0e;
            }
        }
        C35132Mf r12 = (C35132Mf) obj2;
        if (r12 instanceof C25731op) {
            C81434nn r3 = ((C25731op) r12).A00;
            if (r3 instanceof GroupLinkPreviewResponse$Success) {
                C04220Ms.A0C(r3, "null cannot be cast to non-null type com.instagram.direct.request.response.GroupLinkPreviewResponse.Success");
                GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success = (GroupLinkPreviewResponse$Success) r3;
                UserSession userSession = this.A04;
                String valueOf = String.valueOf(groupLinkPreviewResponse$Success.A03);
                boolean z = groupLinkPreviewResponse$Success.A0H;
                boolean z2 = groupLinkPreviewResponse$Success.A0B;
                boolean z3 = groupLinkPreviewResponse$Success.A0D;
                boolean z4 = groupLinkPreviewResponse$Success.A0C;
                if (C31014GdU.A02(userSession, valueOf, z, z2, z3, z4, groupLinkPreviewResponse$Success.A0G, groupLinkPreviewResponse$Success.A0E)) {
                    String str = groupLinkPreviewResponse$Success.A09;
                    if (str != null) {
                        AnonymousClass2NZ.A00(new IDxCallbackShape48S0400000_1_I2(this.A01, this.A02, userSession, this.A05, 1), userSession, str);
                    } else {
                        throw AnonymousClass0wJ.A0b();
                    }
                } else {
                    String str2 = this.A08;
                    String str3 = this.A06;
                    ChatStickerStickerType chatStickerStickerType = ChatStickerStickerType.MESSAGE_STICKER;
                    boolean z5 = this.A0A;
                    C04220Ms.A0B(str2, 0);
                    C04220Ms.A0B(str3, 1);
                    C04220Ms.A0B(chatStickerStickerType, 2);
                    Bundle A062 = C18180wK.A06();
                    A062.putString("GroupPreviewFragment.STORY_ID_KEY", str2);
                    int ordinal = chatStickerStickerType.ordinal();
                    if (ordinal == 2) {
                        r1 = C307522u.CHAT_STICKER;
                    } else if (ordinal != 3) {
                        r1 = C307522u.UNSPECIFIED;
                    } else if (z5) {
                        r1 = C307522u.MESSAGE_SHARE_STICKER_ATTRIBUTION;
                    } else {
                        r1 = C307522u.MESSAGE_SHARE_STICKER;
                    }
                    A062.putSerializable("GroupPreviewFragment.JOINING_SURFACE", r1);
                    A062.putString("GroupPreviewFragment.CHAT_STICKER_CHANNEL_TYPE", str3);
                    AnonymousClass1dV r4 = new AnonymousClass1dV();
                    r4.setArguments(A062);
                    r4.A09 = groupLinkPreviewResponse$Success;
                    C37032Jj9 A0L = C18210wN.A0L(userSession);
                    A0L.A0J = r4;
                    C37383Jqm A002 = A0L.A00();
                    r4.A08 = new AnonymousClass4Bg(A002, A0L, userSession, this.A09);
                    C37383Jqm.A00(this.A01, r4, A002);
                    this.A05.dismiss();
                }
                return Unit.A00;
            }
        }
        this.A05.dismiss();
        C63813iO.A03(this.A01, "general_error_try_again", 2131827947, 0);
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GroupPreviewFragmentLauncher$launchForMessageShareSticker$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
