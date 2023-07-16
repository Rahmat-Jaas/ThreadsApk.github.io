package X;

import android.content.SharedPreferences;
import com.facebook.pando.TreeJNI;
import com.instagram.graphql.instagramschema.IGFxLinkedAccountsQueryResponseImpl;
import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7GU  reason: invalid class name */
public final class AnonymousClass7GU {
    public static final long A00 = TimeUnit.MINUTES.toMillis(5);
    public static final AnonymousClass7GU A01 = new AnonymousClass7GU();

    public static final void A01(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        if (C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 36310486744236117L)) {
            C31155GhB.A03(new C954060e(userSession));
        }
    }

    public static final void A00(AnonymousClass5z0 r5, UserSession userSession) {
        String str;
        TreeJNI treeValue;
        if (!userSession.hasEnded()) {
            Object obj = r5.A01;
            if (obj == null) {
                AnonymousClass0LU.A0B("FxExperimentationHelper", "Error: null response");
                str = "Null response";
            } else {
                TreeJNI treeJNI = (TreeJNI) obj;
                if (treeJNI == null || (treeValue = treeJNI.getTreeValue("fx_linked_accounts", IGFxLinkedAccountsQueryResponseImpl.FxLinkedAccounts.class)) == null) {
                    AnonymousClass0LU.A0B("FxExperimentationHelper", "Error: getFxLinkedAccounts() returns null");
                    str = "FxLinkedAccounts in IGFxLinkedAccountsQueryResponse is null";
                } else {
                    SharedPreferences A012 = AnonymousClass3Zs.A03(userSession).A01(D2R.A14);
                    treeValue.getBooleanValue("linked_account_has_fx");
                    AnonymousClass0wJ.A13(A012.edit(), AnonymousClass00U.A0L(userSession.getUserId(), "_fx_experiment_linked_account_has_fx"), treeValue.getBooleanValue("linked_account_has_fx"));
                    treeValue.getBooleanValue("linked_account_has_fx_in_cl");
                    AnonymousClass0wJ.A13(A012.edit(), AnonymousClass00U.A0L(userSession.getUserId(), C18170wI.A00(772)), treeValue.getBooleanValue("linked_account_has_fx_in_cl"));
                    treeValue.getBooleanValue("cac_destination_migration_enabled");
                    AnonymousClass0wJ.A13(A012.edit(), AnonymousClass00U.A0L(userSession.getUserId(), "_fx_experiment_cac_dest_migration_enabled"), treeValue.getBooleanValue("cac_destination_migration_enabled"));
                    treeValue.getBooleanValue("cac_creator_destination_migration_enabled");
                    AnonymousClass0wJ.A13(A012.edit(), AnonymousClass00U.A0L(userSession.getUserId(), "_fx_experiment_cac_creator_dest_migration_enabled"), treeValue.getBooleanValue("cac_creator_destination_migration_enabled"));
                    treeValue.getBooleanValue("cac_destination_picker_enabled");
                    AnonymousClass0wJ.A13(A012.edit(), AnonymousClass00U.A0L(userSession.getUserId(), "_fx_experiment_cac_dest_picker_enabled"), treeValue.getBooleanValue("cac_destination_picker_enabled"));
                    treeValue.getBooleanValue("should_delete_invalid_tokens_for_business_users");
                    AnonymousClass0wJ.A13(A012.edit(), AnonymousClass00U.A0L(userSession.getUserId(), "_fx_experiment_should_delete_invalid_tokens_for_business_users"), treeValue.getBooleanValue("should_delete_invalid_tokens_for_business_users"));
                    return;
                }
            }
            C10450iM.A03("FxExperimentationHelper", str);
        }
    }
}
