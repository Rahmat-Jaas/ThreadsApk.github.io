package com.instagram.profile.edit.controller;

import X.AnonymousClass06E;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass19U;
import X.AnonymousClass3DU;
import X.AnonymousClass3LY;
import X.AnonymousClass45W;
import X.AnonymousClass45X;
import X.AnonymousClass45Y;
import X.AnonymousClass45Z;
import X.C04220Ms;
import X.C103066Xr;
import X.C18200wM;
import X.C18230wP;
import X.C18590xR;
import X.C18730AkO;
import X.C19577Ayd;
import X.C19819BBt;
import X.C21328BsZ;
import X.C27686Erc;
import X.C28161tl;
import X.C33472Fv;
import X.C38039KHq;
import X.C63803iN;
import X.C64543mW;
import X.C72684Ph;
import X.C72694Pi;
import X.C82394pY;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxObjectShape277S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.profile.edit.fragment.CompleteYourProfileFragment;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class EditProfileFieldsController extends C19819BBt {
    public AnonymousClass3DU A00;
    public C18590xR A01;
    public CompleteYourProfileFragment A02;
    public User A03;
    public boolean A04;
    public final AnonymousClass06E A05;
    public final UserSession A06;
    public final HashMap A07 = AnonymousClass0wJ.A0y();
    public final C82394pY A08;
    public final C82394pY A09;
    public final C82394pY A0A;
    public final C82394pY A0B;
    public FragmentActivity activity;
    public IgFormField bioField;
    public IgdsListCell channelsTextCell;
    public TextView fieldsToCompleteView;
    public C19577Ayd interestRowViewStubHolder;
    public IgdsListCell linksTextCell;
    public IgFormField nameField;
    public TextView percentCompletionView;
    public View profileCompletionProgressBarContainer;
    public IgProgressBar profileCompletionProgressBarView;
    public C19577Ayd profileInterestRowStub;
    public AnimationDrawable progressBarAnimated;
    public Drawable progressBarNormal;
    public IgFormField pronounsField;
    public IgdsListCell toggleBarcelonaAppSwitcherSwitchCell;
    public C19577Ayd toggleBarcelonaAppSwitcherViewStubHolder;
    public IgFormField usernameField;
    public View view;

    public final void onSaveInstanceState(Bundle bundle) {
        C04220Ms.A0B(bundle, 0);
        if (this.nameField != null) {
            bundle.putString("bundle_name_field", AnonymousClass0wJ.A0n(A05().A00));
        }
        if (this.usernameField != null) {
            bundle.putString("bundle_username_field", AnonymousClass0wJ.A0n(A06().A00));
        }
        if (this.bioField != null) {
            bundle.putString("bundle_bio_field", AnonymousClass0wJ.A0n(A04().A00));
        }
    }

    public static final void A00(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, EditProfileFieldsController editProfileFieldsController, String str, long j) {
        String str2 = C103066Xr.A00.A02.A00;
        if (str2 != null) {
            uSLEBaseShape0S0000000.A0S("viewer_id", AnonymousClass0wJ.A0d(editProfileFieldsController.A06.getUserId()));
            C18230wP.A1H(uSLEBaseShape0S0000000, "edit_profile");
            uSLEBaseShape0S0000000.A0T("action_type", str);
            uSLEBaseShape0S0000000.A0T("nav_chain", str2);
            uSLEBaseShape0S0000000.A0S("num_selected_bio_interests", Long.valueOf(j));
            uSLEBaseShape0S0000000.Bb4();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r4.B1g().isEmpty() != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.profile.edit.controller.EditProfileFieldsController r5) {
        /*
            com.instagram.service.session.UserSession r3 = r5.A06
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36322057386007705(0x810ab800011c99, double:3.033553575872392E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0060
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r3)
            X.4sU r4 = r0.A0Q()
            r2 = 0
            if (r4 == 0) goto L_0x0025
            java.util.List r0 = r4.B1g()
            boolean r0 = r0.isEmpty()
            r3 = 1
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            com.instagram.igds.components.textcell.IgdsListCell r0 = r5.channelsTextCell
            if (r0 == 0) goto L_0x006d
            r0.setVisibility(r2)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r5.channelsTextCell
            if (r1 == 0) goto L_0x006d
            r0 = 2131832950(0x7f113076, float:1.9298968E38)
            if (r3 == 0) goto L_0x0039
            r0 = 2131832951(0x7f113077, float:1.929897E38)
        L_0x0039:
            r1.A06(r0)
            if (r3 == 0) goto L_0x0061
            if (r4 == 0) goto L_0x0068
            java.util.List r0 = r4.B1g()
            int r0 = r0.size()
            com.instagram.igds.components.textcell.IgdsListCell r1 = r5.channelsTextCell
            if (r1 == 0) goto L_0x006d
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x0050:
            r1.A0J(r0, r2)
            com.instagram.igds.components.textcell.IgdsListCell r2 = r5.channelsTextCell
            if (r2 == 0) goto L_0x006d
            r1 = 6
            com.facebook.redex.IDxCListenerShape2S0110000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape2S0110000_1_I2
            r0.<init>(r1, r5, r3)
            r2.setOnClickListener(r0)
        L_0x0060:
            return
        L_0x0061:
            com.instagram.igds.components.textcell.IgdsListCell r1 = r5.channelsTextCell
            if (r1 == 0) goto L_0x006d
            java.lang.String r0 = ""
            goto L_0x0050
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x006d:
            java.lang.String r0 = "channelsTextCell"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.edit.controller.EditProfileFieldsController.A01(com.instagram.profile.edit.controller.EditProfileFieldsController):void");
    }

    public static final void A02(EditProfileFieldsController editProfileFieldsController) {
        List list;
        List unmodifiableList;
        AnonymousClass3DU r2 = editProfileFieldsController.A00;
        View view2 = editProfileFieldsController.view;
        if (view2 != null) {
            editProfileFieldsController.A07().setVisibility(0);
            C18230wP.A0H(AnonymousClass0wJ.A0K(view2, R.id.edit_profile_divider)).topMargin = 0;
            if (r2 == null || (list = r2.A0H) == null || (unmodifiableList = Collections.unmodifiableList(list)) == null || unmodifiableList.isEmpty()) {
                editProfileFieldsController.A07().A0H(AnonymousClass0wJ.A0k(editProfileFieldsController.A03(), 2131832989));
                IgdsListCell A072 = editProfileFieldsController.A07();
                C04220Ms.A0B("", 0);
                A072.A0I("", "", false);
            } else {
                editProfileFieldsController.A07().A0H(AnonymousClass0wJ.A0k(editProfileFieldsController.A03(), 2131829679));
                String valueOf = String.valueOf(unmodifiableList.size());
                editProfileFieldsController.A07().A0I(valueOf, valueOf, false);
            }
            if (editProfileFieldsController.profileCompletionProgressBarContainer == null) {
                UserSession userSession = editProfileFieldsController.A06;
                if (C28161tl.A04(userSession).getBoolean("should_show_multiple_links_tooltip", true) && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36318475383607763L)) {
                    editProfileFieldsController.A07().postDelayed(new C72694Pi(editProfileFieldsController), 100);
                }
            }
            AnonymousClass0wJ.A17(editProfileFieldsController.A07(), 48, editProfileFieldsController);
            C18230wP.A0H(editProfileFieldsController.A04()).bottomMargin = 0;
            C18230wP.A0H(editProfileFieldsController.A06()).bottomMargin = 0;
            IgFormField igFormField = editProfileFieldsController.pronounsField;
            if (igFormField != null) {
                C18230wP.A0H(igFormField).bottomMargin = 0;
                C18230wP.A0H(editProfileFieldsController.A05()).bottomMargin = 0;
                C18230wP.A0H(editProfileFieldsController.A04()).bottomMargin = 0;
                return;
            }
            C04220Ms.A0E("pronounsField");
            throw null;
        }
    }

    public final FragmentActivity A03() {
        FragmentActivity fragmentActivity = this.activity;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        C04220Ms.A0E("activity");
        throw null;
    }

    public final IgFormField A04() {
        IgFormField igFormField = this.bioField;
        if (igFormField != null) {
            return igFormField;
        }
        C04220Ms.A0E("bioField");
        throw null;
    }

    public final IgFormField A05() {
        IgFormField igFormField = this.nameField;
        if (igFormField != null) {
            return igFormField;
        }
        C04220Ms.A0E("nameField");
        throw null;
    }

    public final IgFormField A06() {
        IgFormField igFormField = this.usernameField;
        if (igFormField != null) {
            return igFormField;
        }
        C04220Ms.A0E("usernameField");
        throw null;
    }

    public final IgdsListCell A07() {
        IgdsListCell igdsListCell = this.linksTextCell;
        if (igdsListCell != null) {
            return igdsListCell;
        }
        C04220Ms.A0E("linksTextCell");
        throw null;
    }

    public final void A08() {
        AnonymousClass3DU r3;
        View view2;
        if (this.view != null && (r3 = this.A00) != null) {
            AnonymousClass19U r7 = r3.A04;
            if (r7 != null) {
                CompleteYourProfileFragment completeYourProfileFragment = this.A02;
                if (completeYourProfileFragment == null) {
                    C04220Ms.A0E("dataProvider");
                    throw null;
                }
                completeYourProfileFragment.A0B.A00 = false;
                SpannableStringBuilder A0E = C18200wM.A0E(r7.B5p());
                C18730AkO.A01(A03(), A0E, (C21328BsZ) null, this.A06, r7.Afx());
                A04().setText(A0E);
                CompleteYourProfileFragment completeYourProfileFragment2 = this.A02;
                if (completeYourProfileFragment2 == null) {
                    C04220Ms.A0E("dataProvider");
                    throw null;
                }
                completeYourProfileFragment2.A0B.A00 = true;
                A04().A00.setFocusableInTouchMode(false);
                AnonymousClass0wJ.A17(A04().A00, 47, this);
            } else {
                CompleteYourProfileFragment completeYourProfileFragment3 = this.A02;
                if (completeYourProfileFragment3 != null) {
                    completeYourProfileFragment3.A0B.A00 = false;
                    A04().setText(r3.A05);
                    CompleteYourProfileFragment completeYourProfileFragment4 = this.A02;
                    if (completeYourProfileFragment4 != null) {
                        completeYourProfileFragment4.A0B.A00 = true;
                    }
                }
                C04220Ms.A0E("dataProvider");
                throw null;
            }
            if (this.profileCompletionProgressBarContainer == null && (view2 = this.view) != null) {
                view2.postDelayed(new C72684Ph(this), 100);
            }
        }
    }

    public final void A09() {
        String str;
        AnonymousClass3DU r4 = this.A00;
        if (r4 != null) {
            if (this.nameField != null) {
                r4.A09 = AnonymousClass0wJ.A0n(A05().A00);
            }
            r4.A0F = AnonymousClass0wJ.A0n(A06().A00);
            r4.A05 = AnonymousClass0wJ.A0n(A04().A00);
            IgdsListCell igdsListCell = this.toggleBarcelonaAppSwitcherSwitchCell;
            if (igdsListCell != null) {
                boolean z = r4.A0K;
                boolean z2 = igdsListCell.A0E;
                if (z != z2) {
                    UserSession userSession = this.A06;
                    if (z2) {
                        str = "hide_profile_switcher";
                    } else {
                        str = "show_profile_switcher";
                    }
                    C33472Fv.A00(userSession, "edit_profile", str);
                }
                r4.A0K = igdsListCell.A0E;
            }
        }
    }

    public final void onDestroy() {
        C38039KHq A002 = AnonymousClass3LY.A00(this.A06);
        A002.A02(this.A09, AnonymousClass45X.class);
        A002.A02(this.A0B, AnonymousClass45Z.class);
        A002.A02(this.A08, AnonymousClass45W.class);
        A002.A02(this.A0A, AnonymousClass45Y.class);
    }

    public final void onPause() {
        if (this.nameField != null) {
            IgFormField A052 = A05();
            CompleteYourProfileFragment completeYourProfileFragment = this.A02;
            if (completeYourProfileFragment != null) {
                A052.A00.removeTextChangedListener(completeYourProfileFragment.A0B);
            }
            C04220Ms.A0E("dataProvider");
            throw null;
        }
        IgFormField A062 = A06();
        CompleteYourProfileFragment completeYourProfileFragment2 = this.A02;
        if (completeYourProfileFragment2 != null) {
            A062.A00.removeTextChangedListener(completeYourProfileFragment2.A0B);
            EditText editText = A04().A00;
            CompleteYourProfileFragment completeYourProfileFragment3 = this.A02;
            if (completeYourProfileFragment3 != null) {
                editText.removeTextChangedListener(completeYourProfileFragment3.A0B);
                return;
            }
        }
        C04220Ms.A0E("dataProvider");
        throw null;
    }

    public EditProfileFieldsController(AnonymousClass06E r7, UserSession userSession) {
        this.A06 = userSession;
        this.A05 = r7;
        IDxObjectShape277S0100000_1_I2 iDxObjectShape277S0100000_1_I2 = new IDxObjectShape277S0100000_1_I2(this, 6);
        this.A0B = iDxObjectShape277S0100000_1_I2;
        IDxObjectShape277S0100000_1_I2 iDxObjectShape277S0100000_1_I22 = new IDxObjectShape277S0100000_1_I2(this, 5);
        this.A0A = iDxObjectShape277S0100000_1_I22;
        IDxObjectShape277S0100000_1_I2 iDxObjectShape277S0100000_1_I23 = new IDxObjectShape277S0100000_1_I2(this, 4);
        this.A09 = iDxObjectShape277S0100000_1_I23;
        IDxObjectShape277S0100000_1_I2 iDxObjectShape277S0100000_1_I24 = new IDxObjectShape277S0100000_1_I2(this, 3);
        this.A08 = iDxObjectShape277S0100000_1_I24;
        C38039KHq A002 = AnonymousClass3LY.A00(userSession);
        A002.A01(iDxObjectShape277S0100000_1_I23, AnonymousClass45X.class);
        A002.A01(iDxObjectShape277S0100000_1_I2, AnonymousClass45Z.class);
        A002.A01(iDxObjectShape277S0100000_1_I24, AnonymousClass45W.class);
        A002.A01(iDxObjectShape277S0100000_1_I22, AnonymousClass45Y.class);
        this.A04 = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36325033798935401L);
    }

    public final void onDestroyView() {
        A09();
        A06().setRuleChecker((C27686Erc) null);
        A04().A00.removeTextChangedListener(C64543mW.A00(this.A06));
        EditProfileFieldsControllerLifecycleUtil.cleanupReferences(this);
    }

    public final void onResume() {
        A08();
        A02(this);
        A01(this);
        if (this.nameField != null) {
            IgFormField A052 = A05();
            CompleteYourProfileFragment completeYourProfileFragment = this.A02;
            if (completeYourProfileFragment != null) {
                A052.A00.addTextChangedListener(completeYourProfileFragment.A0B);
            }
            C04220Ms.A0E("dataProvider");
            throw null;
        }
        IgFormField A062 = A06();
        CompleteYourProfileFragment completeYourProfileFragment2 = this.A02;
        if (completeYourProfileFragment2 != null) {
            A062.A00.addTextChangedListener(completeYourProfileFragment2.A0B);
            EditText editText = A04().A00;
            CompleteYourProfileFragment completeYourProfileFragment3 = this.A02;
            if (completeYourProfileFragment3 != null) {
                editText.addTextChangedListener(completeYourProfileFragment3.A0B);
                return;
            }
        }
        C04220Ms.A0E("dataProvider");
        throw null;
    }
}
