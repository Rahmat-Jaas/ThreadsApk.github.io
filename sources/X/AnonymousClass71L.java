package X;

import com.instagram.model.shopping.merchant.CreatorShoppingInfo;
import com.instagram.model.shopping.merchant.MicroMerchantDict;
import java.util.Iterator;

/* renamed from: X.71L  reason: invalid class name */
public final class AnonymousClass71L {
    public static CreatorShoppingInfo parseFromJson(MMo mMo) {
        return (CreatorShoppingInfo) C86104wH.A0e(mMo, 128);
    }

    public static void A00(MMp mMp, CreatorShoppingInfo creatorShoppingInfo) {
        mMp.A0J();
        Iterator A0t = C18190wL.A0t(mMp, "linked_merchant_accounts", creatorShoppingInfo.A00);
        while (A0t.hasNext()) {
            MicroMerchantDict microMerchantDict = (MicroMerchantDict) A0t.next();
            if (microMerchantDict != null) {
                C41059Lvf.A00(mMp, microMerchantDict);
            }
        }
        mMp.A0F();
        mMp.A0G();
    }
}
