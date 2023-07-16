package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.LruCache;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.0xK  reason: invalid class name and case insensitive filesystem */
public final class C18520xK extends Handler {
    public final /* synthetic */ CategorySearchFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18520xK(Looper looper, CategorySearchFragment categorySearchFragment) {
        super(looper);
        this.A00 = categorySearchFragment;
    }

    public final void handleMessage(Message message) {
        LruCache lruCache;
        C32165H8c A0K;
        if (message.what == 1) {
            String str = (String) message.obj;
            if (!TextUtils.isEmpty(str)) {
                CategorySearchFragment categorySearchFragment = this.A00;
                C10300i6 r7 = categorySearchFragment.A0A;
                Context requireContext = categorySearchFragment.requireContext();
                AnonymousClass06E A002 = AnonymousClass06E.A00(categorySearchFragment);
                boolean A05 = C67293zJ.A05(categorySearchFragment.A06);
                AnonymousClass1i7 r1 = new AnonymousClass1i7(categorySearchFragment, str);
                if (A05) {
                    lruCache = AnonymousClass3SA.A02;
                } else {
                    lruCache = AnonymousClass3SA.A01;
                }
                Object obj = lruCache.get(str);
                if (obj != null) {
                    r1.onSuccess(obj);
                    return;
                }
                AnonymousClass1iE r3 = new AnonymousClass1iE(r1, str, A05);
                C67463zb A003 = C67463zb.A00();
                A003.A05("query", str);
                boolean A1W = AnonymousClass0wJ.A1W(str);
                A003.A05("locale", C31103Gfm.A00());
                A003.A03("filter_temp_deprecated_cat", false);
                AnonymousClass7Ko.A0B(A1W);
                AnonymousClass7Ko.A0B(true);
                C67473zc A004 = C67473zc.A00(A003, AnonymousClass158.class, "CategoryTypeaheadQuery");
                if (r7 instanceof UserSession) {
                    A0K = C18180wK.A0R(A004, C05030Qo.A02(r7));
                } else {
                    A0K = C18210wN.A0K(A004, r7);
                }
                A0K.A00 = r3;
                C31155GhB.A01(requireContext, A002, A0K);
            }
        }
    }
}
