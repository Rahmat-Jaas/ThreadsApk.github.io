package com.facebook.redex;

import X.AnonymousClass3G9;
import X.AnonymousClass3VO;
import X.AnonymousClass4Dy;
import X.C21800C0z;
import X.C58223Eo;
import X.C61043Rr;
import X.C63893iY;
import X.C70324Dw;
import X.C82664q4;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.login.smartlock.impl.SmartLockPluginImpl;
import java.util.Map;
import java.util.Set;

public class IDxDCallbackShape260S0200000_1_I2 implements C82664q4 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxDCallbackShape260S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void BrJ(Object obj) {
        switch (this.A02) {
            case 0:
                ((C82664q4) this.A00).BrJ(this.A01);
                return;
            case 1:
                SmartLockPluginImpl smartLockPluginImpl = (SmartLockPluginImpl) this.A00;
                Map map = smartLockPluginImpl.A02;
                Object obj2 = this.A01;
                map.put(obj2, obj);
                Set<C82664q4> set = (Set) smartLockPluginImpl.A01.remove(obj2);
                if (set != null) {
                    for (C82664q4 BrJ : set) {
                        BrJ.BrJ(obj);
                    }
                    return;
                }
                return;
            case 2:
                C70324Dw r1 = ((AnonymousClass4Dy) this.A00).A01;
                Fragment fragment = r1.A00;
                C21800C0z c0z = r1.A01;
                FragmentActivity activity = fragment.getActivity();
                if (activity instanceof BaseFragmentActivity) {
                    ((BaseFragmentActivity) activity).A0F(c0z);
                }
                ((C82664q4) this.A01).BrJ(obj);
                return;
            default:
                AnonymousClass3G9 r8 = (AnonymousClass3G9) obj;
                C58223Eo r6 = (C58223Eo) this.A01;
                if (r8 != null) {
                    String str = r8.A01;
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = r8.A00;
                        String str3 = r8.A02;
                        AnonymousClass3VO A002 = AnonymousClass3VO.A00();
                        A002.A03("success", 0);
                        A002.A03(str2, 1);
                        A002.A03(str3, 2);
                        C61043Rr.A00(r6.A00, C63893iY.A04(A002, str, 3), r6.A01);
                        return;
                    }
                    return;
                }
                r6.A00();
                return;
        }
    }
}
