package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass1YC;
import X.AnonymousClass1Z0;
import X.AnonymousClass1bQ;
import X.AnonymousClass1d2;
import X.AnonymousClass1fC;
import X.AnonymousClass1fR;
import X.AnonymousClass23Q;
import X.AnonymousClass2A3;
import X.AnonymousClass2AB;
import X.AnonymousClass2AH;
import X.AnonymousClass2SA;
import X.AnonymousClass3AZ;
import X.AnonymousClass3QF;
import X.AnonymousClass49E;
import X.AnonymousClass4F8;
import X.AnonymousClass4F9;
import X.AnonymousClass4FA;
import X.AnonymousClass4FB;
import X.AnonymousClass4MA;
import X.AnonymousClass4MC;
import X.C04220Ms;
import X.C10450iM;
import X.C143158gC;
import X.C168529ra;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18730xl;
import X.C19480zw;
import X.C28101tf;
import X.C28111tg;
import X.C40326Lcg;
import X.C567338i;
import X.C63293hC;
import X.C63613hu;
import X.C81614o5;
import X.M4h;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.google.gson.Gson;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.nux.aymh.accountprovider.AccountSerializer;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDxRImplShape181S0000000_1_I2;
import kotlin.jvm.internal.IDxRImplShape188S0000000_1_I2;

public class IDxObserverShape27S0400000_1_I2 implements C143158gC {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxObserverShape27S0400000_1_I2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A04 = i;
        this.A00 = obj4;
        this.A03 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        String str;
        AnonymousClass49E r8;
        int i;
        USLEBaseShape0S0000000 A0I;
        AnonymousClass2AB r0;
        Object A002;
        Bundle bundle;
        switch (this.A04) {
            case 0:
                AnonymousClass2SA r12 = (AnonymousClass2SA) obj;
                if (C04220Ms.A0I(r12, C28111tg.A00)) {
                    ((View) this.A01).setVisibility(0);
                    ((View) this.A02).setVisibility(8);
                    return;
                } else if (r12 instanceof C28101tf) {
                    ((View) this.A01).setVisibility(8);
                    ((View) this.A02).setVisibility(0);
                    AnonymousClass1fC r6 = (AnonymousClass1fC) this.A00;
                    AnonymousClass1bQ r2 = (AnonymousClass1bQ) this.A03;
                    Context requireContext = r2.requireContext();
                    List<C81614o5> list = ((C28101tf) r12).A00;
                    IDxRImplShape188S0000000_1_I2 iDxRImplShape188S0000000_1_I2 = new IDxRImplShape188S0000000_1_I2(r2.A02.getValue(), 9);
                    IDxRImplShape188S0000000_1_I2 iDxRImplShape188S0000000_1_I22 = new IDxRImplShape188S0000000_1_I2(r2, 10);
                    IDxRImplShape181S0000000_1_I2 iDxRImplShape181S0000000_1_I2 = new IDxRImplShape181S0000000_1_I2(r2, 11);
                    ArrayList A0x = AnonymousClass0wJ.A0x(list, 10);
                    for (C81614o5 r9 : list) {
                        if (r9 instanceof AnonymousClass4F8) {
                            A002 = new C63613hu(2131821297);
                        } else if (r9 instanceof AnonymousClass4FA) {
                            A002 = AnonymousClass4MC.A05(iDxRImplShape188S0000000_1_I2, 31, 2131821269, ((AnonymousClass4FA) r9).A00);
                        } else if (r9 instanceof AnonymousClass4F9) {
                            String A0k = AnonymousClass0wJ.A0k(requireContext, 2131821299);
                            SpannableStringBuilder A0E = C18200wM.A0E(AnonymousClass0wJ.A0l(requireContext, A0k, 2131821270));
                            C18730xl.A01(A0E, iDxRImplShape181S0000000_1_I2, A0k, requireContext.getColor(R.color.igds_primary_button), 50);
                            A002 = new C63293hC((CharSequence) A0E);
                        } else if (r9 instanceof AnonymousClass4FB) {
                            A002 = AnonymousClass4MA.A00(C18200wM.A0R(r9, iDxRImplShape188S0000000_1_I22, 157), ((AnonymousClass4FB) r9).A00);
                        } else {
                            throw C18190wL.A0a(C18200wM.A0m(r9.getClass(), C18190wL.A0s("unsupported settings item ")));
                        }
                        A0x.add(A002);
                    }
                    r6.setItems(A0x);
                    return;
                } else {
                    return;
                }
            case 1:
                C567338i r122 = (C567338i) obj;
                if (r122 == null) {
                    return;
                }
                if (r122.A01 || ((Fragment) this.A00).isResumed()) {
                    User user = r122.A00;
                    AnonymousClass1Z0 r02 = (AnonymousClass1Z0) this.A00;
                    UserSession userSession = r02.A01;
                    AnonymousClass1fR r3 = new AnonymousClass1fR(r02.A00, userSession, user, (List) this.A01, (List) this.A03);
                    ((RecyclerView) this.A02).setAdapter(r3);
                    for (Object addModel : r3.A01) {
                        r3.addModel(addModel, r3.A00);
                    }
                    for (Object addModel2 : r3.A02) {
                        r3.addModel(addModel2, r3.A00);
                    }
                    r3.notifyDataSetChanged();
                    return;
                }
                return;
            case 2:
                AnonymousClass3AZ r123 = (AnonymousClass3AZ) obj;
                AnonymousClass1d2 r32 = (AnonymousClass1d2) this.A03;
                C04220Ms.A07(r123);
                ArrayList A0v = AnonymousClass0wJ.A0v();
                if (r123.A00) {
                    A0v.add(AnonymousClass23Q.Channels);
                }
                if (r123.A01) {
                    A0v.add(AnonymousClass23Q.Links);
                }
                if (A0v.isEmpty()) {
                    C10450iM.A03(AnonymousClass1d2.__redex_internal_original_name, "Profile tabbed explorer was opened without any links or channels present.");
                } else {
                    String string = r32.requireArguments().getString("ProfileTabbedExplorerFragment.SELECTED_TAB_TYPE");
                    if (string != null) {
                        AnonymousClass23Q valueOf = AnonymousClass23Q.valueOf(string);
                        C19480zw r03 = (C19480zw) r32.A03.getValue();
                        User A032 = r03.A00.A03(r03.A01);
                        if (A032 != null) {
                            int ordinal = valueOf.ordinal();
                            if (ordinal != 1) {
                                i = 0;
                                if (ordinal == 0) {
                                    r8 = (AnonymousClass49E) r32.A01.getValue();
                                    A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r8.A01, "instagram_ibc_profile_actions"), 1832);
                                    if (AnonymousClass0wJ.A1U(A0I)) {
                                        String A0e = C18180wK.A0e();
                                        C04220Ms.A06(A0e);
                                        r8.A00 = A0e;
                                        AnonymousClass2AH.A02(A0I);
                                        AnonymousClass2A3.A00(C40326Lcg.A0K, A0I, "source");
                                        r0 = AnonymousClass2AB.A0I;
                                    }
                                }
                            } else {
                                r8 = (AnonymousClass49E) r32.A01.getValue();
                                i = 0;
                                A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r8.A01, "instagram_ibc_profile_actions"), 1832);
                                if (AnonymousClass0wJ.A1U(A0I)) {
                                    String A0e2 = C18180wK.A0e();
                                    C04220Ms.A06(A0e2);
                                    r8.A00 = A0e2;
                                    AnonymousClass2AH.A02(A0I);
                                    AnonymousClass2A3.A00(C40326Lcg.A0K, A0I, "source");
                                    r0 = AnonymousClass2AB.A04;
                                }
                            }
                            String A003 = AnonymousClass49E.A00(r0, A0I, r8, A032);
                            if (A003 == null) {
                                str = "sessionId";
                                C04220Ms.A0E(str);
                                throw null;
                            }
                            A0I.A0T(AnonymousClass3QF.A00(i, 10, 76), A003);
                            A0I.Bb4();
                        }
                        int indexOf = A0v.indexOf(valueOf);
                        if (indexOf == -1) {
                            indexOf = 0;
                        }
                        C168529ra r04 = r32.A00;
                        if (r04 == null) {
                            str = "adapter";
                            C04220Ms.A0E(str);
                            throw null;
                        }
                        r04.A00(A0v, indexOf);
                    } else {
                        throw AnonymousClass0wJ.A0b();
                    }
                }
                View view = (View) this.A02;
                View view2 = (View) this.A01;
                TextView textView = (TextView) this.A00;
                C168529ra r05 = r32.A00;
                str = "adapter";
                if (r05 != null) {
                    if (r05.A02.size() == 1) {
                        view.setVisibility(8);
                        view2.setVisibility(0);
                        C168529ra r06 = r32.A00;
                        if (r06 != null) {
                            C18180wK.A10(textView, r32, ((AnonymousClass23Q) r06.A02.get(0)).A00);
                            return;
                        }
                    } else {
                        view.setVisibility(0);
                        view2.setVisibility(8);
                        return;
                    }
                }
                C04220Ms.A0E(str);
                throw null;
            default:
                Iterable<Object> iterable = (Iterable) obj;
                AnonymousClass1YC r5 = (AnonymousClass1YC) this.A00;
                if (r5.A00 != null && (bundle = (Bundle) this.A03) != null) {
                    C04220Ms.A0B(iterable, 0);
                    M4h m4h = new M4h();
                    m4h.A05(new AccountSerializer());
                    Gson A033 = m4h.A03();
                    ArrayList A0w = AnonymousClass0wJ.A0w(iterable);
                    for (Object A08 : iterable) {
                        A0w.add(A033.A08(A08));
                    }
                    bundle.putStringArrayList("ig_sso_accounts_array", C18200wM.A0s(A0w));
                    ((IgdsBottomButtonLayout) this.A02).setPrimaryActionOnClickListener(new IDxCListenerShape41S0300000_1_I2(bundle, (FragmentActivity) this.A01, r5, 60));
                    return;
                }
                return;
        }
    }
}
