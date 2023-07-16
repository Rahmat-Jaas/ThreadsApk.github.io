package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass00J;
import X.AnonymousClass0wJ;
import X.AnonymousClass22X;
import X.AnonymousClass5vW;
import X.C04220Ms;
import X.C105466dT;
import X.C106296eo;
import X.C106426f1;
import X.C1199077n;
import X.C132037tD;
import X.C143338gY;
import X.C145168jy;
import X.C145358kN;
import X.C146428mE;
import X.C146958n9;
import X.C18170wI;
import X.C18180wK;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18250wR;
import X.C685344e;
import X.C83334rD;
import X.C86104wH;
import X.EAF;
import X.H8S;
import X.IgU;
import X.LWN;
import com.facebook.graphql.impls.AREffectConsentStateQueryResponseImpl;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3000000_I2;
import com.facebook.pando.TreeJNI;
import com.facebook.papaya.client.ICallback;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.graphql.instagramschema.IGAvatarCoinFlipOptionsResponseImpl;
import com.instagram.graphql.instagramschema.IGProAFTooltipChannelQueryResponseImpl;
import java.util.ArrayList;
import java.util.Iterator;

public class IDxFCallbackShape314S0100000_2_I2 implements C83334rD {
    public Object A00;
    public final int A01;

    public IDxFCallbackShape314S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onFailure(Throwable th) {
        switch (this.A01) {
            case 0:
                C04220Ms.A0B(th, 0);
                ((C145168jy) this.A00).onFailure(th);
                return;
            case 1:
            case 2:
                ((LWN) this.A00).set((Object) null);
                return;
            case 4:
                AnonymousClass0wJ.A13(((C1199077n) this.A00).A00.A00.A01.edit(), "PHONEID_APP_DEVICEID_SYNCED", false);
                C1199077n.A02.set(false);
                return;
            case 5:
                ((C145358kN) this.A00).CDn((Boolean) null, (Integer) null, th);
                return;
            case 6:
            case 7:
                ((C146958n9) this.A00).resumeWith(C18180wK.A0X());
                return;
            default:
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        TreeJNI A03;
        TreeJNI treeValue;
        AnonymousClass22X r1;
        TreeJNI A032;
        TreeJNI treeJNI;
        TreeJNI treeValue2;
        TreeJNI treeValue3;
        TreeJNI A033;
        TreeJNI treeValue4;
        TreeJNI treeValue5;
        TreeJNI treeValue6;
        switch (this.A01) {
            case 0:
                C143338gY r9 = (C143338gY) obj;
                if (r9 == null || (A03 = C685344e.A03(r9)) == null || (treeValue = A03.getTreeValue("viewer", AREffectConsentStateQueryResponseImpl.Viewer.class)) == null || (r1 = (AnonymousClass22X) C86104wH.A0a(treeValue, AnonymousClass22X.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "flm_ar_effect_consent_state")) == null) {
                    onFailure(C18180wK.A0a("Failed to receive user consent state from graphql"));
                    return;
                } else {
                    ((C145168jy) this.A00).CN0(r1);
                    return;
                }
            case 1:
            case 2:
                ((LWN) this.A00).set(obj);
                return;
            case 3:
                C146428mE r92 = (C146428mE) obj;
                if (r92 != null) {
                    r92.CiY((ICallback) this.A00);
                    return;
                }
                return;
            case 4:
                AnonymousClass0wJ.A13(((C1199077n) this.A00).A00.A00.A01.edit(), "PHONEID_APP_DEVICEID_SYNCED", true);
                C1199077n.A02.set(false);
                return;
            case 5:
                String str = (String) obj;
                str.getClass();
                ((C145358kN) this.A00).CDo(str);
                return;
            case 6:
            case 7:
                ((C146958n9) this.A00).resumeWith(C18180wK.A0Y());
                return;
            case 8:
                C143338gY r93 = (C143338gY) obj;
                if (r93 != null && (A033 = C685344e.A03(r93)) != null && (treeValue4 = A033.getTreeValue(C18170wI.A00(14), IGAvatarCoinFlipOptionsResponseImpl.FetchIGUser.class)) != null && (treeValue5 = treeValue4.getTreeValue("user_avatar", IGAvatarCoinFlipOptionsResponseImpl.FetchIGUser.UserAvatar.class)) != null && (treeValue6 = treeValue5.getTreeValue("ig_fetch_coin_flip_options(query_params:$query_params)", IGAvatarCoinFlipOptionsResponseImpl.FetchIGUser.UserAvatar.IgFetchCoinFlipOptions.class)) != null) {
                    C105466dT r6 = (C105466dT) this.A00;
                    ImmutableList A0P = C18230wP.A0P(treeValue6, IGAvatarCoinFlipOptionsResponseImpl.FetchIGUser.UserAvatar.IgFetchCoinFlipOptions.BackgroundOptions.class, "background_options");
                    ArrayList A0w = AnonymousClass0wJ.A0w(A0P);
                    Iterator it = A0P.iterator();
                    while (it.hasNext()) {
                        TreeJNI A0G = C18210wN.A0G(it);
                        String valueOf = String.valueOf(C18250wR.A0X(A0G));
                        String valueOf2 = String.valueOf(C18220wO.A0l(A0G));
                        A0w.add(new AvatarCoinFlipBackgroundOptionResponse(String.valueOf(A0G.getStringValue("accessibility_label")), String.valueOf(A0G.getStringValue("cdn_url")), valueOf, valueOf2));
                    }
                    r6.A00.A02.CrC(new AnonymousClass5vW(A0w));
                    return;
                }
                return;
            case 9:
                C143338gY r94 = (C143338gY) obj;
                if (r94 != null && (A032 = C685344e.A03(r94)) != null) {
                    C106296eo r5 = (C106296eo) this.A00;
                    ImmutableList treeList = A032.getTreeList("xfb_aymt_instagram_graphql_channel_tip(input:$input)", IGProAFTooltipChannelQueryResponseImpl.XfbAymtInstagramGraphqlChannelTip.class);
                    String str2 = null;
                    if (treeList != null && (treeJNI = (TreeJNI) AnonymousClass00J.A0G(treeList, 0)) != null) {
                        TreeJNI treeJNI2 = (TreeJNI) AnonymousClass00J.A0G(C18230wP.A0P(treeJNI, IGProAFTooltipChannelQueryResponseImpl.XfbAymtInstagramGraphqlChannelTip.Specs.class, "specs"), 0);
                        if (!(treeJNI2 == null || (treeValue2 = treeJNI2.getTreeValue(DialogModule.KEY_TITLE, IGProAFTooltipChannelQueryResponseImpl.XfbAymtInstagramGraphqlChannelTip.Specs.Title.class)) == null || (treeValue3 = treeValue2.getTreeValue("text", IGProAFTooltipChannelQueryResponseImpl.XfbAymtInstagramGraphqlChannelTip.Specs.Title.Text.class)) == null)) {
                            str2 = treeValue3.getStringValue("text");
                        }
                        r5.A00.A04.CaU(new KtCSuperShape0S3000000_I2(treeJNI.getStringValue("channel_id"), treeJNI.getStringValue("tip_id"), str2, 22));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                C106426f1 r95 = (C106426f1) obj;
                if (r95 != null) {
                    C132037tD r12 = (C132037tD) this.A00;
                    if (r95.A00) {
                        EAF.A00(r12.A01).A09((H8S) H8S.A01.getValue(), (IgU) null, AnonymousClass006.A1C);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
