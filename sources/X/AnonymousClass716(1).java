package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.716  reason: invalid class name */
public final class AnonymousClass716 {
    public static NewFundraiserInfo parseFromJson(MMo mMo) {
        return (NewFundraiserInfo) C86104wH.A0e(mMo, 97);
    }

    public static void A00(MMp mMp, NewFundraiserInfo newFundraiserInfo) {
        mMp.A0J();
        String str = newFundraiserInfo.A02;
        if (str != null) {
            mMp.A0d("charity_user_igid", str);
        }
        mMp.A0b("goal_amount", newFundraiserInfo.A00);
        String str2 = newFundraiserInfo.A05;
        if (str2 != null) {
            mMp.A0d("goal_currency", str2);
        }
        String str3 = newFundraiserInfo.A07;
        if (str3 != null) {
            mMp.A0d(DialogModule.KEY_TITLE, str3);
        }
        mMp.A0e("is_test", newFundraiserInfo.A09);
        String str4 = newFundraiserInfo.A03;
        if (str4 != null) {
            mMp.A0d(DevServerEntity.COLUMN_DESCRIPTION, str4);
        }
        String str5 = newFundraiserInfo.A06;
        if (str5 != null) {
            mMp.A0d("source_name", str5);
        }
        String str6 = newFundraiserInfo.A01;
        if (str6 != null) {
            mMp.A0d("charity_id", str6);
        }
        List list = newFundraiserInfo.A08;
        if (list != null) {
            Iterator A0t = C18190wL.A0t(mMp, "selected_users_to_be_invited", list);
            while (A0t.hasNext()) {
                String A0k = C18180wK.A0k(A0t);
                if (A0k != null) {
                    mMp.A0Y(A0k);
                }
            }
            mMp.A0F();
        }
        String str7 = newFundraiserInfo.A04;
        if (str7 != null) {
            mMp.A0d("fundraiser_type", str7);
        }
        mMp.A0G();
    }
}
