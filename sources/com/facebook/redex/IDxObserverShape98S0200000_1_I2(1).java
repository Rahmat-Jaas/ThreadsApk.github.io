package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass10z;
import X.AnonymousClass1TK;
import X.AnonymousClass1ZM;
import X.AnonymousClass1a4;
import X.AnonymousClass1ap;
import X.AnonymousClass38Z;
import X.AnonymousClass3I1;
import X.AnonymousClass3Zw;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C13950oZ;
import X.C143158gC;
import X.C150388wA;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C18230wP;
import X.C18250wR;
import X.C18330wh;
import X.C22961bg;
import X.C23071bs;
import X.C23251cq;
import X.C34612Ibi;
import X.C565537q;
import X.C65253sw;
import X.E2V;
import X.I6G;
import X.ILe;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000100_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2502000_I2;
import com.instagram.api.schemas.AdsTargetingGender;
import com.instagram.barcelona.R;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape63S0200000_1_I2;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class IDxObserverShape98S0200000_1_I2 implements C143158gC {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxObserverShape98S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        String str;
        E2V e2v;
        String string;
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        View A0K;
        int i;
        Integer num;
        Object obj2 = obj;
        switch (this.A02) {
            case 0:
            case 1:
                KtCSuperShape0S1100000_I2 ktCSuperShape0S1100000_I2 = (KtCSuperShape0S1100000_I2) obj2;
                AnonymousClass1a4 r3 = (AnonymousClass1a4) this.A01;
                String str2 = ktCSuperShape0S1100000_I2.A01;
                Context requireContext = r3.requireContext();
                if (str2 != null) {
                    string = AnonymousClass0wJ.A0l(requireContext, str2, 2131822253);
                } else {
                    string = requireContext.getString(2131822252);
                }
                C04220Ms.A09(string);
                AnonymousClass4u2 r0 = r3.A00;
                if (r0 != null) {
                    r0.setTitle(string);
                }
                AnonymousClass3I1 r1 = new AnonymousClass3I1();
                r1.A02((List) ktCSuperShape0S1100000_I2.A00);
                ((C150388wA) this.A00).A04(r1);
                return;
            case 2:
                List<AnonymousClass1TK> list = (List) obj2;
                C22961bg r5 = (C22961bg) this.A01;
                RecyclerView A0L = C18230wP.A0L((View) this.A00);
                r5.A00 = A0L;
                if (A0L != null) {
                    r5.getContext();
                    C18190wL.A1D(A0L);
                }
                for (AnonymousClass1TK r12 : list) {
                    if (C18190wL.A1Z(r12.A00, true) && (num = r12.A01) != null) {
                        r5.A09.add(num);
                    }
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout2 = r5.A04;
                if (igdsBottomButtonLayout2 != null) {
                    igdsBottomButtonLayout2.setPrimaryButtonEnabled(C18190wL.A1a(r5.A09));
                }
                AnonymousClass10z r13 = new AnonymousClass10z(r5, list);
                r5.A01 = r13;
                RecyclerView recyclerView = r5.A00;
                if (recyclerView != null) {
                    recyclerView.setAdapter(r13);
                    return;
                }
                return;
            case 3:
                KtCSuperShape0S2502000_I2 ktCSuperShape0S2502000_I2 = (KtCSuperShape0S2502000_I2) obj2;
                if (ktCSuperShape0S2502000_I2 != null) {
                    C34612Ibi ibi = (C34612Ibi) this.A01;
                    View view = (View) this.A00;
                    View A0J = AnonymousClass0wJ.A0J(view, R.id.primary_audience_title);
                    View A0J2 = AnonymousClass0wJ.A0J(view, R.id.location_row);
                    View A0K2 = AnonymousClass0wJ.A0K(view, R.id.gender_row);
                    View A0K3 = AnonymousClass0wJ.A0K(view, R.id.ages_row);
                    A0K = AnonymousClass0wJ.A0K(view, R.id.interests_row);
                    TextView A0G = C18180wK.A0G(A0J, R.id.primary_text);
                    String str3 = ktCSuperShape0S2502000_I2.A08;
                    String str4 = str3;
                    if (str3 == null) {
                        str4 = ibi.getString(2131822476);
                    }
                    A0G.setText(str4);
                    TextView A0G2 = C18180wK.A0G(A0J, R.id.primary_text_description);
                    C18180wK.A10(A0G2, ibi, 2131822475);
                    i = 0;
                    int i2 = 8;
                    if (str3 == null) {
                        i2 = 0;
                    }
                    A0G2.setVisibility(i2);
                    C18180wK.A10(C18180wK.A0G(A0J2, R.id.label_text), ibi, 2131822472);
                    TextView A0G3 = C18180wK.A0G(A0J2, R.id.value_text);
                    C04220Ms.A04(A0G3);
                    List list2 = (List) ktCSuperShape0S2502000_I2.A04;
                    if (!list2.isEmpty()) {
                        ibi.A06.getValue();
                        String A002 = I6G.A00((ILe) list2.get(0));
                        if (list2.size() == 1) {
                            A0G3.setText(A002);
                        } else {
                            String A0g = C18180wK.A0g(ibi, 2131822474);
                            AnonymousClass3Zw.A03(new IDxCSpanShape63S0200000_1_I2(C18180wK.A00(ibi), 1, (Object) list2, (Object) ibi), A0G3, A0g, C18220wO.A0k(ibi, A002, A0g, 2131822473));
                        }
                    }
                    C18180wK.A10(C18180wK.A0G(A0K2, R.id.label_text), ibi, 2131822469);
                    C18180wK.A0G(A0K2, R.id.value_text).setText(C18190wL.A0r(Locale.ROOT, ((AdsTargetingGender) ktCSuperShape0S2502000_I2.A02).A00));
                    C18180wK.A10(C18180wK.A0G(A0K3, R.id.label_text), ibi, 2131822466);
                    C18180wK.A0G(A0K3, R.id.value_text).setText(C18220wO.A0k(ibi, String.valueOf(ktCSuperShape0S2502000_I2.A01), String.valueOf(ktCSuperShape0S2502000_I2.A00), 2131822467));
                    List<KtCSuperShape0S1000100_I2> list3 = (List) ktCSuperShape0S2502000_I2.A05;
                    if (!list3.isEmpty()) {
                        C18180wK.A10(C18180wK.A0G(A0K, R.id.label_text), ibi, 2131822471);
                        TextView A0G4 = C18180wK.A0G(A0K, R.id.value_text);
                        ArrayList A0w = AnonymousClass0wJ.A0w(list3);
                        for (KtCSuperShape0S1000100_I2 ktCSuperShape0S1000100_I2 : list3) {
                            A0w.add(ktCSuperShape0S1000100_I2.A01);
                        }
                        A0G4.setText(C18200wM.A0l(", ", A0w));
                        break;
                    } else {
                        A0K.setVisibility(8);
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                Boolean bool = (Boolean) obj2;
                Fragment fragment = (Fragment) this.A01;
                View view2 = (View) this.A00;
                C04220Ms.A07(bool);
                boolean booleanValue = bool.booleanValue();
                AnonymousClass0wJ.A0I(view2, R.id.monetization_screen_footer).setVisibility(0);
                TextView A0G5 = C18180wK.A0G(view2, R.id.monetization_screen_footer);
                int i3 = 2131824653;
                if (booleanValue) {
                    i3 = 2131824652;
                }
                C18180wK.A10(A0G5, fragment, i3);
                return;
            case 6:
                String str5 = (String) obj2;
                AnonymousClass1ZM r14 = (AnonymousClass1ZM) this.A01;
                View view3 = (View) this.A00;
                C04220Ms.A07(str5);
                UserSession A0X = AnonymousClass0wJ.A0X(r14.A03);
                Object value = r14.A02.getValue();
                AnonymousClass0wJ.A1N(A0X, value);
                if (!AnonymousClass0wJ.A0Y(A0X).A3a()) {
                    return;
                }
                if ((C04220Ms.A0I(ValuePropsFlow.SUBSCRIPTION.A00, value) || C04220Ms.A0I(ValuePropsFlow.BADGES.A00, value)) && (igdsBottomButtonLayout = (IgdsBottomButtonLayout) view3.findViewById(R.id.value_props_bottom_button_layout)) != null) {
                    igdsBottomButtonLayout.setFooterText(str5);
                    return;
                }
                return;
            case 8:
                AnonymousClass1ap r52 = (AnonymousClass1ap) this.A01;
                RecyclerView recyclerView2 = (RecyclerView) this.A00;
                List list4 = ((C565537q) obj2).A00;
                AnonymousClass3I1 r2 = new AnonymousClass3I1();
                r2.A02(list4);
                C150388wA r02 = r52.A00;
                if (r02 != null) {
                    r02.A04(r2);
                    C150388wA r03 = r52.A00;
                    if (r03 != null) {
                        recyclerView2.setAdapter(r03);
                        return;
                    }
                }
                C04220Ms.A0E("adapter");
                throw null;
            case 9:
                Boolean bool2 = (Boolean) obj2;
                C04220Ms.A07(bool2);
                boolean booleanValue2 = bool2.booleanValue();
                ((View) this.A00).setEnabled(booleanValue2);
                C23071bs r04 = (C23071bs) this.A01;
                r04.A07 = booleanValue2;
                E2V.A0G(C18190wL.A0M(r04));
                return;
            case 10:
                Boolean bool3 = (Boolean) obj2;
                C04220Ms.A07(bool3);
                boolean booleanValue3 = bool3.booleanValue();
                C23251cq r4 = (C23251cq) this.A01;
                E2V e2v2 = r4.A01;
                if (booleanValue3) {
                    if (e2v2 == null) {
                        C04220Ms.A0E("actionBarService");
                        throw null;
                    }
                    e2v2.Cqb(2131825706);
                    E2V e2v3 = r4.A01;
                    if (e2v3 == null) {
                        C04220Ms.A0E("actionBarService");
                        throw null;
                    }
                    e2v3.CtU(C18190wL.A0H(r4, 389), true);
                    E2V e2v4 = r4.A01;
                    if (e2v4 == null) {
                        C04220Ms.A0E("actionBarService");
                        throw null;
                    }
                    e2v4.CpF((String) null, C65253sw.A00);
                    E2V e2v5 = r4.A01;
                    if (e2v5 == null) {
                        C04220Ms.A0E("actionBarService");
                        throw null;
                    }
                    e2v5.A0P.setImageResource(R.drawable.instagram_x_pano_outline_24);
                    E2V e2v6 = r4.A01;
                    if (e2v6 == null) {
                        C04220Ms.A0E("actionBarService");
                        throw null;
                    } else {
                        e2v6.A0P(C18190wL.A0H(r4, 390), R.drawable.instagram_check_pano_outline_24, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
                        return;
                    }
                } else if (e2v2 == null) {
                    C04220Ms.A0E("actionBarService");
                    throw null;
                } else {
                    Integer num2 = r4.A03;
                    if (num2 != null) {
                        Integer num3 = AnonymousClass006.A01;
                        int i4 = 2131825705;
                        if (num2 == num3) {
                            i4 = 2131825707;
                        }
                        e2v2.Cqb(i4);
                        E2V e2v7 = r4.A01;
                        if (e2v7 == null) {
                            C04220Ms.A0E("actionBarService");
                            throw null;
                        }
                        e2v7.CtU(C18190wL.A0H(r4, 391), true);
                        E2V e2v8 = r4.A01;
                        if (e2v8 == null) {
                            C04220Ms.A0E("actionBarService");
                            throw null;
                        }
                        e2v8.A0P.setImageResource(R.drawable.instagram_arrow_back_24);
                        String str6 = r4.A04;
                        if (str6 == null) {
                            C04220Ms.A0E("entryPoint");
                            throw null;
                        }
                        if (str6.equals("upsell")) {
                            E2V e2v9 = r4.A01;
                            if (e2v9 == null) {
                                C04220Ms.A0E("actionBarService");
                                throw null;
                            }
                            e2v9.CpF(r4.getString(2131826219), C18190wL.A0H(r4, 392));
                            e2v = r4.A01;
                            if (e2v == null) {
                                C04220Ms.A0E("actionBarService");
                                throw null;
                            }
                        } else {
                            Integer num4 = r4.A03;
                            if (num4 != null) {
                                if (num4 == num3) {
                                    View A0K4 = AnonymousClass0wJ.A0K((View) this.A00, R.id.dictionary_manager_new_words_input_field);
                                    E2V e2v10 = r4.A01;
                                    if (e2v10 == null) {
                                        C04220Ms.A0E("actionBarService");
                                        throw null;
                                    }
                                    e2v10.CpF(r4.getString(2131826219), C18200wM.A0R(r4, A0K4, 78));
                                    e2v = r4.A01;
                                    if (e2v == null) {
                                        C04220Ms.A0E("actionBarService");
                                        throw null;
                                    }
                                } else {
                                    E2V e2v11 = r4.A01;
                                    if (e2v11 == null) {
                                        C04220Ms.A0E("actionBarService");
                                        throw null;
                                    } else {
                                        e2v11.A0P(C18190wL.A0H(r4, 393), R.drawable.instagram_share_android_pano_outline_24, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
                                        return;
                                    }
                                }
                            }
                        }
                        e2v.CtQ((View.OnClickListener) null, false);
                        return;
                    }
                    C04220Ms.A0E("surfaceType");
                    throw null;
                }
            case 11:
                List list5 = (List) obj2;
                AnonymousClass3I1 r05 = new AnonymousClass3I1();
                r05.A02(list5);
                ((C150388wA) this.A00).A04(r05);
                E2V e2v12 = ((C23251cq) this.A01).A01;
                if (e2v12 == null) {
                    C04220Ms.A0E("actionBarService");
                    throw null;
                }
                C04220Ms.A07(list5);
                e2v12.AJT(C18190wL.A1a(list5));
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                AnonymousClass38Z r42 = (AnonymousClass38Z) obj2;
                if (r42.A01) {
                    C18330wh r22 = (C18330wh) this.A01;
                    if (!r22.isShowing()) {
                        C13950oZ.A00(r22);
                    }
                    Integer num5 = r42.A00;
                    if (num5 != null) {
                        str = ((Context) this.A00).getString(num5.intValue());
                    } else {
                        str = "";
                    }
                    r22.A04(str);
                    return;
                }
                C18250wR.A1C(this.A01);
                return;
            default:
                Boolean bool4 = (Boolean) obj2;
                C04220Ms.A07(bool4);
                boolean booleanValue4 = bool4.booleanValue();
                A0K = AnonymousClass0wJ.A0I((View) this.A00, R.id.loading_indicator);
                i = C18190wL.A00(booleanValue4 ? 1 : 0);
                break;
        }
        A0K.setVisibility(i);
    }
}
