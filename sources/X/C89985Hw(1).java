package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.ShoppingHomeDestination;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.5Hw  reason: invalid class name and case insensitive filesystem */
public final class C89985Hw extends AnonymousClass0Sf {
    public KtCSuperShape0S0610000_I2 A00;
    public KtCSuperShape0S1000000_I2 A01;
    public KtCSuperShape0S1000000_I2 A02;
    public ShoppingHomeDestination A03 = null;
    public C19187As6 A04;

    public C89985Hw() {
        KtCSuperShape0S1000000_I2 ktCSuperShape0S1000000_I2 = new KtCSuperShape0S1000000_I2("", 22);
        KtCSuperShape0S0610000_I2 ktCSuperShape0S0610000_I2 = new KtCSuperShape0S0610000_I2((MultiProductComponent) null, (Boolean) null, (Integer) null, (Integer) null, (ArrayList) null, (ArrayList) null, (DefaultConstructorMarker) null, (int) StringTreeSet.MAX_SYMBOL_COUNT, 1, false);
        C19187As6 as6 = new C19187As6((ShoppingHomeDestination) null, 16383);
        KtCSuperShape0S1000000_I2 ktCSuperShape0S1000000_I22 = new KtCSuperShape0S1000000_I2();
        this.A02 = ktCSuperShape0S1000000_I2;
        this.A00 = ktCSuperShape0S0610000_I2;
        this.A04 = as6;
        this.A01 = ktCSuperShape0S1000000_I22;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89985Hw) {
                C89985Hw r5 = (C89985Hw) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String A00() {
        String str;
        C19187As6 as6 = this.A04;
        ShoppingHomeDestination shoppingHomeDestination = as6.A09;
        if (shoppingHomeDestination != null) {
            return shoppingHomeDestination.A00.A00;
        }
        KtCSuperShape0S0300000_I2 ktCSuperShape0S0300000_I2 = as6.A00;
        if (ktCSuperShape0S0300000_I2 != null) {
            Merchant merchant = (Merchant) ktCSuperShape0S0300000_I2.A00;
            if (merchant != null) {
                str = merchant.A06;
            } else {
                str = null;
            }
            C04220Ms.A0A(str);
            return str;
        }
        KtCSuperShape0S1000000_I2 ktCSuperShape0S1000000_I2 = as6.A01;
        if (ktCSuperShape0S1000000_I2 != null) {
            return ktCSuperShape0S1000000_I2.A00;
        }
        throw C18180wK.A0a(AnonymousClass000.A00(674));
    }

    public final String A01() {
        C19187As6 as6 = this.A04;
        ShoppingHomeDestination shoppingHomeDestination = as6.A09;
        if (shoppingHomeDestination != null) {
            return shoppingHomeDestination.A00.A00;
        }
        if (as6.A00 != null) {
            return "merchant_shortcut";
        }
        if (as6.A01 != null) {
            return "search_shortcut";
        }
        throw C18180wK.A0a("Destination required to determine submodule");
    }

    public final int hashCode() {
        int A042 = C18210wN.A04(this.A02);
        return AnonymousClass0wJ.A05(this.A04, (AnonymousClass0wJ.A05(this.A00, A042) + AnonymousClass0wJ.A03(this.A03)) * 31) + C18200wM.A07(this.A01);
    }
}
