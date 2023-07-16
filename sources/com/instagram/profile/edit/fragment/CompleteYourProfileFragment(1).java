package com.instagram.profile.edit.fragment;

import X.AnonymousClass006;
import X.AnonymousClass00J;
import X.AnonymousClass00U;
import X.AnonymousClass06E;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass11W;
import X.AnonymousClass192;
import X.AnonymousClass19B;
import X.AnonymousClass1l0;
import X.AnonymousClass1l2;
import X.AnonymousClass266;
import X.AnonymousClass3DU;
import X.AnonymousClass3I1;
import X.AnonymousClass3LY;
import X.AnonymousClass46R;
import X.AnonymousClass4Aj;
import X.AnonymousClass4DW;
import X.AnonymousClass4u2;
import X.AnonymousClass8bA;
import X.C04220Ms;
import X.C06750aI;
import X.C10300i6;
import X.C13330nS;
import X.C14030oh;
import X.C150388wA;
import X.C15720rm;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C18330wh;
import X.C18489AgL;
import X.C19577Ayd;
import X.C21743BzU;
import X.C25764Drc;
import X.C31155GhB;
import X.C32165H8c;
import X.C34640IcN;
import X.C37408JrQ;
import X.C63503hc;
import X.C63803iN;
import X.C63873iU;
import X.C64503mS;
import X.C67293zJ;
import X.C72704Pj;
import X.C82034oy;
import X.C82394pY;
import X.C82424pb;
import X.C84654td;
import X.IA1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.facebook.redex.IDxCDelegateShape871S0100000_1_I2;
import com.facebook.redex.IDxCListenerShape2S0200100_1_I2;
import com.facebook.redex.IDxObjectShape277S0100000_1_I2;
import com.instagram.actionbar.ActionButton;
import com.instagram.barcelona.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.profile.edit.controller.EditProfileFieldsController;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CompleteYourProfileFragment extends C34640IcN implements C82424pb, C82034oy {
    public AnonymousClass4Aj A00;
    public BusinessFlowAnalyticsLogger A01;
    public AnonymousClass3DU A02;
    public EditProfileFieldsController A03;
    public UserSession A04;
    public User A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09 = true;
    public C84654td A0A;
    public final C64503mS A0B = new C64503mS(this);
    public final C82394pY A0C = new IDxObjectShape277S0100000_1_I2(this, 7);
    public IgImageView mAvatarImageView;
    public TextView mChangeAvatarButton;
    public ActionButton mSaveButton;

    public final String getModuleName() {
        return "complete_your_profile_fragment";
    }

    public static void A00(CompleteYourProfileFragment completeYourProfileFragment) {
        String str;
        String str2;
        User user;
        View view;
        String Ak1;
        String A0A2;
        String str3;
        StringBuilder A0r;
        int i;
        long j;
        C19577Ayd ayd;
        Boolean bool;
        KtCSuperShape0S0110000_I2 ktCSuperShape0S0110000_I2;
        List list;
        CompleteYourProfileFragment completeYourProfileFragment2 = completeYourProfileFragment;
        if (completeYourProfileFragment2.mView != null && completeYourProfileFragment2.A02 != null) {
            A02(completeYourProfileFragment2);
            C64503mS r8 = completeYourProfileFragment2.A0B;
            r8.A00 = false;
            EditProfileFieldsController editProfileFieldsController = completeYourProfileFragment2.A03;
            AnonymousClass3DU r0 = completeYourProfileFragment2.A02;
            User user2 = completeYourProfileFragment2.A05;
            if (r0 != null) {
                editProfileFieldsController.A00 = r0;
                if (user2 != null) {
                    editProfileFieldsController.A03 = user2;
                    editProfileFieldsController.A05().setText(r0.A09);
                    IgFormField A062 = editProfileFieldsController.A06();
                    AnonymousClass3DU r02 = editProfileFieldsController.A00;
                    if (r02 != null) {
                        str = r02.A0F;
                    } else {
                        str = null;
                    }
                    A062.setText(str);
                    String str4 = "dataProvider";
                    if (editProfileFieldsController.A02 != null) {
                        editProfileFieldsController.A08();
                        AnonymousClass3DU r03 = editProfileFieldsController.A00;
                        if (r03 == null || (list = r03.A0I) == null || (str2 = TextUtils.join("/", list)) == null) {
                            str2 = "";
                        }
                        IgFormField igFormField = editProfileFieldsController.pronounsField;
                        if (igFormField != null) {
                            igFormField.setText(str2);
                            IgFormField igFormField2 = editProfileFieldsController.pronounsField;
                            if (igFormField2 != null) {
                                igFormField2.A00.setFocusable(false);
                                IgFormField igFormField3 = editProfileFieldsController.pronounsField;
                                if (igFormField3 != null) {
                                    AnonymousClass0wJ.A17(igFormField3.A00, 49, editProfileFieldsController);
                                    EditProfileFieldsController.A02(editProfileFieldsController);
                                    EditProfileFieldsController.A01(editProfileFieldsController);
                                    UserSession userSession = editProfileFieldsController.A06;
                                    C19577Ayd ayd2 = editProfileFieldsController.toggleBarcelonaAppSwitcherViewStubHolder;
                                    if (ayd2 != null) {
                                        ayd2.A09(8);
                                        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36321065248496102L)) {
                                            List A1P = user2.A1P();
                                            if (A1P != null) {
                                                j = (long) A1P.size();
                                            } else {
                                                j = 0;
                                            }
                                            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(new C15720rm("edit_profile_fields_controller"), userSession), "ig_bio_interests_profile_events"), 811);
                                            View view2 = editProfileFieldsController.view;
                                            if (!(view2 == null || view2.getContext() == null || (ayd = editProfileFieldsController.profileInterestRowStub) == null || ayd.A0A())) {
                                                EditProfileFieldsController.A00(A0I, editProfileFieldsController, "unit_impression", j);
                                                ayd.A09(0);
                                                FragmentActivity A032 = editProfileFieldsController.A03();
                                                RecyclerView recyclerView = (RecyclerView) C18230wP.A0G(ayd);
                                                List<C21743BzU> A1P2 = user2.A1P();
                                                Integer num = AnonymousClass006.A01;
                                                AnonymousClass4DW r6 = new AnonymousClass4DW(A0I, editProfileFieldsController, j);
                                                boolean A1Z = C18200wM.A1Z(recyclerView);
                                                IA1 ia1 = new IA1();
                                                ia1.A00 = false;
                                                recyclerView.setItemAnimator(ia1);
                                                recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                                                recyclerView.A0y(new AnonymousClass11W(0, C18240wQ.A01(A032, 8)));
                                                C18489AgL A002 = C150388wA.A00(A032);
                                                A002.A01(new AnonymousClass1l2(A032, r6, userSession, num));
                                                C150388wA A0Z = C18220wO.A0Z(A002, new AnonymousClass1l0(A032, r6, userSession));
                                                AnonymousClass3I1 r62 = new AnonymousClass3I1();
                                                ArrayList arrayList = null;
                                                if (A1P2 != null) {
                                                    arrayList = AnonymousClass0wJ.A0w(A1P2);
                                                    for (C21743BzU bzU : A1P2) {
                                                        if (bzU != null) {
                                                            ktCSuperShape0S0110000_I2 = new KtCSuperShape0S0110000_I2(bzU);
                                                        } else {
                                                            ktCSuperShape0S0110000_I2 = null;
                                                        }
                                                        arrayList.add(ktCSuperShape0S0110000_I2);
                                                    }
                                                }
                                                ArrayList A0v = AnonymousClass0wJ.A0v();
                                                if (arrayList == null || arrayList.isEmpty()) {
                                                    A0v.clear();
                                                    A0v.add(new AnonymousClass19B(A1Z));
                                                } else {
                                                    A0v.clear();
                                                    ArrayList A0w = AnonymousClass0wJ.A0w(arrayList);
                                                    int i2 = 0;
                                                    for (Object next : arrayList) {
                                                        int i3 = i2 + 1;
                                                        if (i2 < 0) {
                                                            C06750aI.A1A();
                                                            throw null;
                                                        }
                                                        KtCSuperShape0S0110000_I2 ktCSuperShape0S0110000_I22 = (KtCSuperShape0S0110000_I2) next;
                                                        if (ktCSuperShape0S0110000_I22 != null) {
                                                            bool = Boolean.valueOf(A0v.add(new AnonymousClass192(ktCSuperShape0S0110000_I22, C18180wK.A1W(i2))));
                                                        } else {
                                                            bool = null;
                                                        }
                                                        A0w.add(bool);
                                                        i2 = i3;
                                                    }
                                                }
                                                r62.A02(AnonymousClass00J.A0N(A0v));
                                                A0Z.A04(r62);
                                                recyclerView.setAdapter(A0Z);
                                            }
                                            C19577Ayd ayd3 = editProfileFieldsController.interestRowViewStubHolder;
                                            if (ayd3 != null) {
                                                ayd3.A08().setOnClickListener(new IDxCListenerShape2S0200100_1_I2(0, j, A0I, editProfileFieldsController));
                                            } else {
                                                str4 = "interestRowViewStubHolder";
                                            }
                                        }
                                        if (!(editProfileFieldsController.profileCompletionProgressBarContainer == null || (user = editProfileFieldsController.A03) == null || (view = editProfileFieldsController.view) == null)) {
                                            AnonymousClass3DU r1 = editProfileFieldsController.A00;
                                            Context context = view.getContext();
                                            if (context != null) {
                                                ArrayList A0v2 = AnonymousClass0wJ.A0v();
                                                if (user.A34()) {
                                                    A0v2.add(context.getString(2131833046));
                                                }
                                                if (r1 != null) {
                                                    Ak1 = r1.A09;
                                                } else {
                                                    Ak1 = user.Ak1();
                                                }
                                                int i4 = 0;
                                                if (Ak1 == null || Ak1.length() == 0) {
                                                    A0v2.add(context.getString(2131833044));
                                                }
                                                String A0v3 = user.A0v();
                                                if (A0v3 == null || A0v3.length() == 0) {
                                                    A0v2.add(context.getString(2131833042));
                                                }
                                                double d = (double) 3;
                                                int A003 = AnonymousClass8bA.A00(((d - ((double) A0v2.size())) / d) * ((double) 100));
                                                String A0A3 = AnonymousClass00U.A0A(AnonymousClass0wJ.A0l(context, Integer.valueOf(A003), 2131833045), ' ');
                                                if (A0v2.isEmpty()) {
                                                    A0A2 = AnonymousClass0wJ.A0k(context, 2131833048);
                                                } else {
                                                    A0A2 = AnonymousClass00U.A0A(context.getString(2131833047), ' ');
                                                    Iterator it = A0v2.iterator();
                                                    while (it.hasNext()) {
                                                        Object next2 = it.next();
                                                        int i5 = i4 + 1;
                                                        if (i4 < 0) {
                                                            C06750aI.A1A();
                                                            throw null;
                                                        }
                                                        String str5 = (String) next2;
                                                        if (i4 > 0) {
                                                            if (i4 != A0v2.size() - 1) {
                                                                A0r = C18200wM.A0r();
                                                                i = 2131833043;
                                                            } else if (i4 == A0v2.size() - 1) {
                                                                A0r = C18200wM.A0r();
                                                                i = 2131833041;
                                                            }
                                                            C18210wN.A0u(context, A0r, i);
                                                            A0r.append(' ');
                                                            str3 = A0r.toString();
                                                            A0A2 = AnonymousClass00U.A0V(A0A2, str3, str5);
                                                            i4 = i5;
                                                        }
                                                        str3 = "";
                                                        A0A2 = AnonymousClass00U.A0V(A0A2, str3, str5);
                                                        i4 = i5;
                                                    }
                                                }
                                                AnonymousClass0wJ.A1Q(A0A3, A0A2);
                                                TextView textView = editProfileFieldsController.percentCompletionView;
                                                if (textView != null) {
                                                    textView.setText(A0A3);
                                                }
                                                TextView textView2 = editProfileFieldsController.fieldsToCompleteView;
                                                if (textView2 != null) {
                                                    textView2.setText(A0A2);
                                                }
                                                IgProgressBar igProgressBar = editProfileFieldsController.profileCompletionProgressBarView;
                                                if (igProgressBar != null) {
                                                    igProgressBar.setProgress(A003);
                                                }
                                                if (editProfileFieldsController.A04) {
                                                    IgProgressBar igProgressBar2 = editProfileFieldsController.profileCompletionProgressBarView;
                                                    if (A003 == 100) {
                                                        if (igProgressBar2 != null) {
                                                            igProgressBar2.setProgressDrawable(editProfileFieldsController.progressBarAnimated);
                                                        }
                                                        View view3 = editProfileFieldsController.view;
                                                        if (view3 != null) {
                                                            view3.post(new C72704Pj(editProfileFieldsController));
                                                        }
                                                    } else if (igProgressBar2 != null) {
                                                        igProgressBar2.setProgressDrawable(editProfileFieldsController.progressBarNormal);
                                                    }
                                                }
                                            } else {
                                                throw C18180wK.A0a("Required value was null.");
                                            }
                                        }
                                        r8.A00 = true;
                                        A01(completeYourProfileFragment2);
                                        return;
                                    }
                                    str4 = "toggleBarcelonaAppSwitcherViewStubHolder";
                                }
                            }
                        }
                        str4 = "pronounsField";
                    }
                    C04220Ms.A0E(str4);
                    throw null;
                }
                throw C18180wK.A0a("Required value was null.");
            }
            throw C18180wK.A0a("Required value was null.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0049, code lost:
        if (r0.length() > 0) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.instagram.profile.edit.fragment.CompleteYourProfileFragment r4) {
        /*
            com.instagram.actionbar.ActionButton r3 = r4.mSaveButton
            if (r3 == 0) goto L_0x004e
            android.view.View r0 = r4.mView
            if (r0 == 0) goto L_0x004e
            com.instagram.profile.edit.controller.EditProfileFieldsController r4 = r4.A03
            com.instagram.igds.components.form.IgFormField r0 = r4.A06()
            android.widget.EditText r0 = r0.A00
            android.text.Editable r0 = r0.getText()
            X.C04220Ms.A06(r0)
            int r0 = r0.length()
            r2 = 1
            boolean r1 = X.C18180wK.A1X(r0)
            com.instagram.igds.components.form.IgFormField r0 = r4.A05()
            android.widget.EditText r0 = r0.A00
            android.text.Editable r0 = r0.getText()
            X.C04220Ms.A06(r0)
            int r0 = r0.length()
            boolean r0 = X.C18180wK.A1X(r0)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x004f
            com.instagram.igds.components.form.IgFormField r0 = r4.A04()
            android.widget.EditText r0 = r0.A00
            android.text.Editable r0 = r0.getText()
            X.C04220Ms.A06(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x004f
        L_0x004b:
            r3.setEnabled(r2)
        L_0x004e:
            return
        L_0x004f:
            r2 = 0
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.edit.fragment.CompleteYourProfileFragment.A01(com.instagram.profile.edit.fragment.CompleteYourProfileFragment):void");
    }

    public static void A02(CompleteYourProfileFragment completeYourProfileFragment) {
        IgImageView igImageView = completeYourProfileFragment.mAvatarImageView;
        if (igImageView != null) {
            C18220wO.A1L(completeYourProfileFragment, igImageView, completeYourProfileFragment.A05);
        }
        if (completeYourProfileFragment.mChangeAvatarButton != null) {
            boolean A34 = completeYourProfileFragment.A05.A34();
            TextView textView = completeYourProfileFragment.mChangeAvatarButton;
            int i = 2131823223;
            if (A34) {
                i = 2131821100;
            }
            textView.setText(i);
        }
    }

    public static void A03(CompleteYourProfileFragment completeYourProfileFragment, String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = completeYourProfileFragment.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdy(new C37408JrQ("profile_completion", completeYourProfileFragment.A06, "continue", str, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        this.mSaveButton = AnonymousClass4u2.A00(C18210wN.A0H(this, 52), r3, "");
        A01(this);
        C25764Drc A0K = C18190wL.A0K();
        A0K.A0C = C18210wN.A0H(this, 53);
        A0K.A04 = 2131824015;
        AnonymousClass4u2.A03(A0K, r3);
    }

    public final C10300i6 getSession() {
        return this.A04;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!this.A09 || (businessFlowAnalyticsLogger = this.A01) == null) {
            return false;
        }
        businessFlowAnalyticsLogger.BbZ(new C37408JrQ("profile_completion", this.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A00.A09(intent, i, i2, false);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A0A = C67293zJ.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1466685548);
        super.onCreate(bundle);
        Bundle A072 = C18250wR.A07(this);
        UserSession A0V = C18180wK.A0V(A072);
        this.A04 = A0V;
        EditProfileFieldsController editProfileFieldsController = new EditProfileFieldsController(AnonymousClass06E.A00(this), A0V);
        this.A03 = editProfileFieldsController;
        registerLifecycleListener(editProfileFieldsController);
        this.A05 = AnonymousClass0wJ.A0Y(this.A04);
        this.A06 = A072.getString("entry_point");
        this.A08 = C18240wQ.A1S(A072, "ARG_CHECKLIST_ITEM_COMPLETED");
        BusinessFlowAnalyticsLogger A002 = C67293zJ.A00(this.A0A, this, this.A04);
        this.A01 = A002;
        if (A002 != null) {
            A002.Bdt(new C37408JrQ("profile_completion", this.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        UserSession userSession = this.A04;
        this.A00 = new AnonymousClass4Aj(this, C18250wR.A0B(this), new IDxCDelegateShape871S0100000_1_I2(this, 1), userSession, this.A05, AnonymousClass006.A0s);
        C18330wh r3 = new C18330wh(getContext());
        C18330wh.A03(this, r3, 2131830080);
        C32165H8c A062 = C63503hc.A06(this.A04);
        C63873iU.A0F(A062, this, r3, 29);
        C31155GhB.A03(A062);
        C14030oh.A09(1360781239, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x00a8, code lost:
        if (r1 == false) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
            r11 = this;
            r0 = -1359328329(0xffffffffaefa4bb7, float:-1.13821334E-10)
            int r3 = X.C14030oh.A02(r0)
            r0 = 2131493952(0x7f0c0440, float:1.8611399E38)
            r5 = 0
            android.view.View r4 = r12.inflate(r0, r13, r5)
            com.instagram.profile.edit.controller.EditProfileFieldsController r2 = r11.A03
            androidx.fragment.app.FragmentActivity r1 = r11.getActivity()
            com.instagram.user.model.User r9 = r11.A05
            X.C04220Ms.A0B(r1, r5)
            r0 = 1
            X.C18190wL.A1S(r4, r0, r9)
            r2.A02 = r11
            r2.activity = r1
            r2.view = r4
            r0 = 2131300837(0x7f0911e5, float:1.8219715E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r4, r0)
            com.instagram.igds.components.form.IgFormField r0 = (com.instagram.igds.components.form.IgFormField) r0
            X.C04220Ms.A0B(r0, r5)
            r2.nameField = r0
            com.instagram.igds.components.form.IgFormField r6 = r2.A05()
            androidx.fragment.app.FragmentActivity r0 = r2.A03()
            r10 = 2131834847(0x7f1137df, float:1.9302816E38)
            java.lang.String r1 = r0.getString(r10)
            X.4Cu r0 = new X.4Cu
            r0.<init>(r1)
            r6.setRuleChecker(r0)
            r0 = 2131308781(0x7f0930ed, float:1.8235827E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r4, r0)
            com.instagram.igds.components.form.IgFormField r0 = (com.instagram.igds.components.form.IgFormField) r0
            X.C04220Ms.A0B(r0, r5)
            r2.usernameField = r0
            X.35d r1 = new X.35d
            r1.<init>(r2)
            X.0xR r0 = new X.0xR
            r0.<init>(r1)
            r2.A01 = r0
            com.instagram.igds.components.form.IgFormField r6 = r2.A06()
            r1 = 2
            com.facebook.redex.IDxRCheckerShape619S0100000_1_I2 r0 = new com.facebook.redex.IDxRCheckerShape619S0100000_1_I2
            r0.<init>(r2, r1)
            r6.setRuleChecker(r0)
            r0 = 2131305020(0x7f09223c, float:1.82282E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r4, r0)
            com.instagram.igds.components.form.IgFormField r0 = (com.instagram.igds.components.form.IgFormField) r0
            X.C04220Ms.A0B(r0, r5)
            r2.pronounsField = r0
            com.instagram.service.session.UserSession r8 = r2.A06
            X.0TJ r7 = X.AnonymousClass0TJ.A05
            r0 = 36313231228142957(0x8102b10000056d, double:3.0279718780986404E-306)
            boolean r1 = X.C63803iN.A0E(r7, r8, r0)
            r6 = 8
            com.instagram.igds.components.form.IgFormField r0 = r2.pronounsField
            if (r0 == 0) goto L_0x0166
            if (r1 == 0) goto L_0x0161
            r0.setVisibility(r5)
        L_0x0096:
            boolean r0 = X.C60103Nr.A01(r9)
            if (r0 == 0) goto L_0x00aa
            r0 = 36325033798738790(0x810d6d00072366, double:3.0354358712685823E-306)
            boolean r1 = X.C63803iN.A0E(r7, r8, r0)
            r0 = 2131297395(0x7f090473, float:1.8212734E38)
            if (r1 != 0) goto L_0x00ad
        L_0x00aa:
            r0 = 2131297394(0x7f090472, float:1.8212732E38)
        L_0x00ad:
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r4, r0)
            com.instagram.igds.components.form.IgFormField r0 = (com.instagram.igds.components.form.IgFormField) r0
            X.C04220Ms.A0B(r0, r5)
            r2.bioField = r0
            com.instagram.igds.components.form.IgFormField r0 = r2.A04()
            r0.setVisibility(r5)
            com.instagram.igds.components.form.IgFormField r9 = r2.A04()
            androidx.fragment.app.FragmentActivity r0 = r2.A03()
            java.lang.String r1 = r0.getString(r10)
            X.4Cu r0 = new X.4Cu
            r0.<init>(r1)
            r9.setRuleChecker(r0)
            X.3mW r1 = X.C64543mW.A00(r8)
            com.instagram.igds.components.form.IgFormField r0 = r2.A04()
            android.widget.EditText r0 = r0.A00
            r0.addTextChangedListener(r1)
            r0 = 2131302643(0x7f0918f3, float:1.8223378E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r4, r0)
            com.instagram.igds.components.textcell.IgdsListCell r0 = (com.instagram.igds.components.textcell.IgdsListCell) r0
            X.C04220Ms.A0B(r0, r5)
            r2.linksTextCell = r0
            r0 = 2131298312(0x7f090808, float:1.8214594E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r4, r0)
            com.instagram.igds.components.textcell.IgdsListCell r0 = (com.instagram.igds.components.textcell.IgdsListCell) r0
            X.C04220Ms.A0B(r0, r5)
            r2.channelsTextCell = r0
            r0 = 2131308231(0x7f092ec7, float:1.8234712E38)
            X.Ayd r0 = X.C18190wL.A0T(r4, r0)
            r2.toggleBarcelonaAppSwitcherViewStubHolder = r0
            r0 = 2131302186(0x7f09172a, float:1.822245E38)
            X.Ayd r0 = X.C18190wL.A0T(r4, r0)
            r2.interestRowViewStubHolder = r0
            r0 = 36321065248496102(0x8109d1000019e6, double:3.032926144115037E-306)
            boolean r1 = X.C63803iN.A0E(r7, r8, r0)
            X.Ayd r0 = r2.interestRowViewStubHolder
            if (r0 == 0) goto L_0x0169
            if (r1 == 0) goto L_0x015d
            r0.A09(r5)
            X.Ayd r0 = r2.interestRowViewStubHolder
            if (r0 == 0) goto L_0x0169
            android.view.View r1 = r0.A08()
            r0 = 2131304810(0x7f09216a, float:1.8227773E38)
            X.Ayd r0 = X.C18190wL.A0T(r1, r0)
            r2.profileInterestRowStub = r0
        L_0x0131:
            r0 = 2131308181(0x7f092e95, float:1.823461E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r4, r0)
            r0 = 2131824232(0x7f110e68, float:1.9281286E38)
            r1.setText(r0)
            r0 = 2131307619(0x7f092c63, float:1.823347E38)
            android.widget.TextView r2 = X.AnonymousClass0wJ.A0L(r4, r0)
            com.instagram.user.model.User r0 = r11.A05
            boolean r1 = X.C59623Lo.A01(r0)
            r0 = 2131824231(0x7f110e67, float:1.9281284E38)
            if (r1 == 0) goto L_0x0153
            r0 = 2131824230(0x7f110e66, float:1.9281282E38)
        L_0x0153:
            r2.setText(r0)
            r0 = 2016693768(0x78344e08, float:1.4628064E34)
            X.C14030oh.A09(r0, r3)
            return r4
        L_0x015d:
            r0.A09(r6)
            goto L_0x0131
        L_0x0161:
            r0.setVisibility(r6)
            goto L_0x0096
        L_0x0166:
            java.lang.String r0 = "pronounsField"
            goto L_0x016b
        L_0x0169:
            java.lang.String r0 = "interestRowViewStubHolder"
        L_0x016b:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.edit.fragment.CompleteYourProfileFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1774528546);
        super.onDestroyView();
        AnonymousClass3LY.A00(this.A04).A02(this.A0C, AnonymousClass46R.class);
        C14030oh.A09(-2105393123, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-2060869903);
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.getWindow().setSoftInputMode(48);
        }
        C14030oh.A09(1939939026, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1557717387);
        super.onResume();
        A01(this);
        C18180wK.A0F(this).setSoftInputMode(32);
        C14030oh.A09(254190277, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        IgImageView A0M = C18250wR.A0M(view, R.id.profile_pic_imageview);
        this.mAvatarImageView = A0M;
        A0M.setVisibility(0);
        AnonymousClass0wJ.A17(this.mAvatarImageView, 50, this);
        TextView A0L = AnonymousClass0wJ.A0L(view, R.id.change_avatar_button);
        this.mChangeAvatarButton = A0L;
        A0L.setVisibility(0);
        AnonymousClass0wJ.A17(this.mChangeAvatarButton, 51, this);
        A00(this);
        EditProfileFieldsController editProfileFieldsController = this.A03;
        AnonymousClass266 A0g = this.A05.A0g();
        C04220Ms.A0B(A0g, 0);
        if (A0g == AnonymousClass266.A04) {
            editProfileFieldsController.A05().setLabelText(editProfileFieldsController.A03().getString(2131822785));
        }
        AnonymousClass3LY.A00(this.A04).A01(this.A0C, AnonymousClass46R.class);
    }
}
