package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C12560m7;
import X.C14030oh;
import X.C18180wK;
import X.C18220wO;
import X.C23411dm;
import X.C34640IcN;
import X.C63613hu;
import X.C82034oy;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.debug.devoptions.igds.compose.IgdsBottomButtonComposeExamplesFragment;
import com.instagram.debug.devoptions.igds.compose.IgdsBulletCellComposeExamplesFragment;
import com.instagram.debug.devoptions.igds.compose.IgdsButtonComposeStyleExamplesFragment;
import com.instagram.debug.devoptions.igds.compose.IgdsDialogComposeExamplesFragment;
import com.instagram.debug.devoptions.igds.compose.IgdsFacepileAvatarsComposeFragment;
import com.instagram.debug.devoptions.igds.compose.IgdsFormFieldComposeExamplesFragment;
import com.instagram.debug.devoptions.igds.compose.IgdsHeadlineComposeFragment;
import com.instagram.debug.devoptions.igds.compose.IgdsPeopleCellComposeFragment;
import com.instagram.debug.devoptions.igds.compose.IgdsPostHeaderComposeFragment;
import com.instagram.debug.devoptions.igds.compose.IgdsProfilePictureComposeFragment;
import com.instagram.debug.devoptions.igds.compose.IgdsSearchBarComposeFragment;
import com.instagram.debug.devoptions.igds.compose.IgdsSegmentedPillsComposeExamplesFragment;
import com.instagram.debug.devoptions.igds.compose.IgdsTabBarComposeExamplesFragment;
import com.instagram.debug.devoptions.igds.compose.IgdsTextCellComposeExamplesFragment;
import com.instagram.debug.devoptions.igds.compose.IgdsTooltipComposeExamplesFragment;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IgdsComponentShowcaseFragment extends C23411dm implements C82034oy {
    public final Map mMenuItems = new HashMap<Integer, C34640IcN>() {
        {
            put(2131825249, new IgdsPostHeaderComposeFragment());
            put(2131825230, new IgdsBottomButtonExamplesFragment());
            put(2131825229, new IgdsBottomButtonComposeExamplesFragment());
            put(2131828628, new IGDSButtonStyleExamplesFragment());
            put(2131828627, new IgdsButtonComposeStyleExamplesFragment());
            put(2131828640, new IgdsSearchBarComposeFragment());
            put(2131825244, new IgdsMediaButtonExamplesFragment());
            put(2131825237, new IgdsDialogStyleExamplesFragment());
            put(2131825236, new IgdsDialogComposeExamplesFragment());
            put(2131825227, new IgdsActionSheetExamplesFragment());
            put(2131825231, new IgdsBottomSheetExamplesFragment());
            put(2131825253, new IgdsSnackbarStyleExamplesFragment());
            put(2131825248, new IgdsPillExamplesFragment());
            put(2131825261, new IgdsToastStyleExamplesFragment());
            put(2131825246, new IgdsInAppNotificationExamplesFragment());
            put(2131828632, new IgdsFacepileAvatarsComposeFragment());
            put(2131825239, new IgdsFormFieldExamplesFragment());
            put(2131825238, new IgdsFormFieldComposeExamplesFragment());
            put(2131825255, new IgdsTabBarComposeExamplesFragment());
            put(2131825263, new IgdsTooltipExamplesFragment());
            put(2131825262, new IgdsTooltipComposeExamplesFragment());
            put(2131825242, new IgdsHeadlineExamplesFragment());
            put(2131825241, new IgdsHeadlineComposeFragment());
            put(2131825259, new IgdsTextCellExamplesFragment());
            put(2131825258, new IgdsTextCellComposeExamplesFragment());
            put(2131825247, new IgdsPeopleCellExamplesFragment());
            put(2131828634, new IgdsPeopleCellComposeFragment());
            put(2131825252, new IgdsSegmentedTabExamplesFragment());
            put(2131825251, new IgdsSegmentedPillsComposeExamplesFragment());
            put(2131825254, new IgdsStepperHeaderExamplesFragment());
            put(2131825243, new IgdsInlineSearchBoxExamplesFragment());
            put(2131825234, new IgdsBulletCellExamplesFragment());
            put(2131825233, new IgdsBulletCellComposeExamplesFragment());
            put(2131825228, new IgdsBannerExamplesFragment());
            put(2131825245, new ImmersiveNetegoExamplesFragment());
            put(2131825235, new IgdsContextMenuExampleFragment());
            put(2131825260, new IgdsTextGroupExamplesFragment());
            put(2131825250, new IgdsProfilePictureComposeFragment());
        }
    };
    public UserSession mUserSession;

    public String getModuleName() {
        return "igds_component_showcase";
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    private void setAndCreateItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63613hu.A01("IGDS Components", A0v);
        final HashMap A0y = AnonymousClass0wJ.A0y();
        Iterator A0x = C18220wO.A0x(this.mMenuItems);
        while (A0x.hasNext()) {
            Number number = (Number) A0x.next();
            A0y.put(AnonymousClass0wJ.A0B(this).getString(number.intValue()), this.mMenuItems.get(number));
        }
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        A0v2.addAll(A0y.keySet());
        Collections.sort(A0v2);
        Iterator it = A0v2.iterator();
        while (it.hasNext()) {
            final String A0k = C18180wK.A0k(it);
            AnonymousClass4MA.A02(new View.OnClickListener() {
                public void onClick(View view) {
                    int A05 = C14030oh.A05(154367971);
                    Fragment fragment = (Fragment) A0y.get(A0k);
                    if (fragment != null) {
                        AnonymousClass0wJ.A19(fragment, IgdsComponentShowcaseFragment.this.requireActivity(), IgdsComponentShowcaseFragment.this.mUserSession);
                    }
                    C14030oh.A0C(-640381370, A05);
                }
            }, A0k, A0v);
        }
        setItems(A0v);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        r2.Cqb(2131828629);
        C12560m7 r0 = this.mFragmentManager;
        if (r0 != null) {
            r2.CtT(C18180wK.A1X(r0.A0I()));
        }
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(817273565);
        super.onCreate(bundle);
        this.mUserSession = AnonymousClass0wJ.A0W(this);
        C14030oh.A09(573377216, A02);
    }

    public void onResume() {
        int A02 = C14030oh.A02(584204446);
        super.onResume();
        setAndCreateItems();
        C14030oh.A09(-330171922, A02);
    }
}
