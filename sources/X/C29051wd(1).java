package X;

import android.os.Bundle;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.redex.IDxCListenerShape219S0200000_1_I2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1wd  reason: invalid class name and case insensitive filesystem */
public final class C29051wd extends C23411dm implements C82034oy {
    public static final Map A02 = AnonymousClass4WJ.A0H(C18180wK.A0p(Integer.valueOf(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET), "16 KB"), C18180wK.A0p(32768, "32 KB"), C18180wK.A0p(Integer.valueOf(Constants.LOAD_RESULT_PGO_ATTEMPTED), "64 KB"), C18180wK.A0p(Integer.valueOf(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP), "128 KB"), C18180wK.A0p(Integer.valueOf(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED), "256 KB"), C18180wK.A0p(524288, "512 KB"), C18180wK.A0p(1048576, "1 MB"), C18180wK.A0p(2097152, "2 MB"), C18180wK.A0p(4194304, "4 MB"), C18180wK.A0p(Integer.valueOf(DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE), "8 MB"));
    public static final String __redex_internal_original_name = "SamplingSizeChoiceFragment";
    public int A00;
    public C10300i6 A01;

    public final void configureActionBar(AnonymousClass4u2 r3) {
        String str;
        C04220Ms.A0B(r3, 0);
        if (this.A00 == 0) {
            str = "Java Allocations Sampling Size";
        } else {
            str = "Native Allocations Sampling Size";
        }
        r3.setTitle(str);
        C12560m7 r0 = this.mFragmentManager;
        boolean z = false;
        if (r0 != null && r0.A0I() > 0) {
            z = true;
        }
        r3.CtT(z);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1770063608);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = bundle2.getInt("MEMORY_TYPE");
            this.A01 = C18190wL.A0S(bundle2);
        } else {
            this.A00 = 0;
        }
        C14030oh.A09(1264022953, A022);
    }

    public final void onResume() {
        C08410dK r0;
        int A022 = C14030oh.A02(1730719957);
        super.onResume();
        int i = this.A00;
        int i2 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
        int i3 = DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
        if (i == 0) {
            i2 = Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            i3 = 2097152;
        }
        Map map = A02;
        LinkedHashMap A0y = C18220wO.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            int A04 = AnonymousClass0wJ.A04(A0o.getKey());
            if (A04 >= i2 && A04 <= i3) {
                C18210wN.A1Q(A0y, A0o);
            }
        }
        ArrayList A0k = C18240wQ.A0k(A0y.size());
        Iterator A0u = C18190wL.A0u(A0y);
        while (A0u.hasNext()) {
            Map.Entry A0o2 = C18180wK.A0o(A0u);
            int A042 = AnonymousClass0wJ.A04(A0o2.getKey());
            C62563aI.A01(String.valueOf(A042), C18230wP.A0u(A0o2), A0k);
        }
        int i4 = this.A00;
        C09120et A0X = C18190wL.A0X();
        if (i4 == 0) {
            r0 = A0X.A1b;
        } else {
            r0 = A0X.A1o;
        }
        setItems(C18180wK.A0n(new C61353Sw(new IDxCListenerShape219S0200000_1_I2(1, this, A0k), String.valueOf(AnonymousClass0wJ.A04(C18220wO.A0f(r0))), A0k)));
        C14030oh.A09(1636149481, A022);
    }
}
