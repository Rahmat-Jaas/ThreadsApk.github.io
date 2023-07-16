package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.GrowthFrictionInfo;
import com.instagram.api.schemas.GrowthFrictionInterventionButton;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6yP  reason: invalid class name and case insensitive filesystem */
public final class C117266yP {
    public static GrowthFrictionInfo parseFromJson(MMo mMo) {
        return (GrowthFrictionInfo) C86104wH.A0d(mMo, 50);
    }

    public static void A00(MMp mMp, GrowthFrictionInfo growthFrictionInfo) {
        mMp.A0J();
        mMp.A0e("has_active_interventions", growthFrictionInfo.A01);
        HashMap hashMap = growthFrictionInfo.A00;
        if (hashMap != null) {
            mMp.A0U("interventions");
            mMp.A0J();
            Iterator A0u = C18190wL.A0u(hashMap);
            while (A0u.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0u);
                if (C86104wH.A0c(mMp, A0o) == null) {
                    mMp.A0H();
                } else {
                    GrowthFrictionInterventionDetail growthFrictionInterventionDetail = (GrowthFrictionInterventionDetail) A0o.getValue();
                    mMp.A0J();
                    mMp.A0d("action", growthFrictionInterventionDetail.A00);
                    Iterator A0t = C18190wL.A0t(mMp, "buttons", growthFrictionInterventionDetail.A05);
                    while (A0t.hasNext()) {
                        GrowthFrictionInterventionButton growthFrictionInterventionButton = (GrowthFrictionInterventionButton) A0t.next();
                        if (growthFrictionInterventionButton != null) {
                            mMp.A0J();
                            String str = growthFrictionInterventionButton.A01;
                            if (str != null) {
                                mMp.A0d("action", str);
                            }
                            Boolean bool = growthFrictionInterventionButton.A00;
                            if (bool != null) {
                                mMp.A0e("is_primary", bool.booleanValue());
                            }
                            String str2 = growthFrictionInterventionButton.A02;
                            if (str2 != null) {
                                mMp.A0d("text", str2);
                            }
                            String str3 = growthFrictionInterventionButton.A03;
                            if (str3 != null) {
                                mMp.A0d("url", str3);
                            }
                            mMp.A0G();
                        }
                    }
                    mMp.A0F();
                    mMp.A0d(DevServerEntity.COLUMN_DESCRIPTION, growthFrictionInterventionDetail.A01);
                    mMp.A0d("intervention_name", growthFrictionInterventionDetail.A02);
                    mMp.A0d(DialogModule.KEY_TITLE, growthFrictionInterventionDetail.A03);
                    String str4 = growthFrictionInterventionDetail.A04;
                    if (str4 != null) {
                        mMp.A0d("url", str4);
                    }
                    mMp.A0G();
                }
            }
            mMp.A0G();
        }
        mMp.A0G();
    }
}
