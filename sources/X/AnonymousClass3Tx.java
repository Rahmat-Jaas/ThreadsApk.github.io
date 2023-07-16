package X;

import com.facebook.pando.TreeJNI;
import com.instagram.graphql.instagramschemagraphservices.FxIgXavSwitcherBadgingDataQueryResponseImpl;
import fxcache.model.FxCalAccountLinkageInfoForSwitcher;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Tx  reason: invalid class name */
public final class AnonymousClass3Tx {
    public static final AnonymousClass3Tx A00 = new AnonymousClass3Tx();

    public final FxCalAccountLinkageInfoForSwitcher A00(FxIgXavSwitcherBadgingDataQueryResponseImpl fxIgXavSwitcherBadgingDataQueryResponseImpl) {
        long currentTimeMillis;
        List list;
        if (fxIgXavSwitcherBadgingDataQueryResponseImpl == null) {
            currentTimeMillis = 0;
            list = AnonymousClass0ZV.A00;
        } else {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            C1366783w A0G = C18250wR.A0G(fxIgXavSwitcherBadgingDataQueryResponseImpl, FxIgXavSwitcherBadgingDataQueryResponseImpl.SwitcherAccountsData.class, "switcher_accounts_data(account_types:[\"FACEBOOK\",\"INSTAGRAM\"],caller_name:$caller_name,family_device_id:$family_device_id)");
            while (A0G.hasNext()) {
                TreeJNI treeJNI = (TreeJNI) A0G.next();
                C04220Ms.A04(treeJNI);
                String A0m = C18220wO.A0m(treeJNI);
                if (A0m != null) {
                    A0v.add(new FxCalAccountWithSwitcherInfo(treeJNI.getIntValue("badge_count"), A0m, treeJNI.getStringValue("instagram_id"), "", "", "", "", ""));
                } else {
                    throw AnonymousClass0wJ.A0b();
                }
            }
            currentTimeMillis = System.currentTimeMillis();
            list = A0v;
        }
        return new FxCalAccountLinkageInfoForSwitcher(list, currentTimeMillis);
    }
}
