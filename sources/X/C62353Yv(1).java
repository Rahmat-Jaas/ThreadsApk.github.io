package X;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.user.model.MicroUserDict;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.3Yv  reason: invalid class name and case insensitive filesystem */
public final class C62353Yv {
    public HashMap A00 = AnonymousClass0wJ.A0y();
    public HashMap A01 = AnonymousClass0wJ.A0y();
    public C10300i6 A02;

    public static C62353Yv A00(C10300i6 r2) {
        return (C62353Yv) C18180wK.A0c(r2, C62353Yv.class, 2);
    }

    public final void A02() {
        C62813an A012 = C62813an.A01(this.A02);
        HashSet A0u = C18200wM.A0u();
        for (AccountFamily accountFamily : A012.A02.values()) {
            Iterator it = C50492t5.A00(accountFamily.A03).iterator();
            while (it.hasNext()) {
                C72144Mm.A00(A0u, it);
            }
        }
        Iterator A0u2 = C18190wL.A0u(this.A00);
        boolean z = false;
        while (A0u2.hasNext()) {
            MicroUserDict microUserDict = ((AnonymousClass3H7) C18180wK.A0o(A0u2).getValue()).A00.A01;
            C04220Ms.A0B(microUserDict, 0);
            if (!A0u.contains(new C72144Mm(microUserDict).A01())) {
                A0u2.remove();
                z = true;
            }
        }
        if (z) {
            A03(this.A00.values());
        }
    }

    public final void A04(Collection collection) {
        if (collection != null) {
            try {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AnonymousClass3FU r2 = (AnonymousClass3FU) it.next();
                    this.A01.put(r2.A00(), r2);
                }
                LinkedList linkedList = new LinkedList(this.A01.values());
                StringWriter A0d = C18230wP.A0d();
                MMp A0K = C18180wK.A0K(A0d);
                Iterator A0t = C18190wL.A0t(A0K, "account_list", linkedList);
                while (A0t.hasNext()) {
                    AnonymousClass3FU r22 = (AnonymousClass3FU) A0t.next();
                    if (r22 != null) {
                        A0K.A0J();
                        String str = r22.A01;
                        if (str != null) {
                            A0K.A0d("one_tap_nonce", str);
                        }
                        if (r22.A00 != null) {
                            A0K.A0U("user");
                            AnonymousClass3PL.A00(A0K, r22.A00);
                        }
                        A0K.A0e("is_one_tap_opted_in", r22.A02);
                        A0K.A0G();
                    }
                }
                A0K.A0F();
                String A0h = C18180wK.A0h(A0K, A0d);
                C08350dD A002 = C08360dF.A00();
                C04220Ms.A0B(A0h, 0);
                C18180wK.A0v(C18220wO.A0B(A002), "deferred_recovered_account_data", A0h);
            } catch (IOException e) {
                C10450iM.A03("DeferredAccountHelper", C18230wP.A0t("Unable to save deferred accounts. Error: ", e));
            }
        }
    }

    public C62353Yv(C10300i6 r5) {
        this.A02 = r5;
        String string = C18200wM.A0C().getString("deferred_account_data", "");
        C04220Ms.A0A(string);
        String string2 = C18200wM.A0C().getString("deferred_recovered_account_data", "");
        C04220Ms.A0A(string2);
        try {
            if (!TextUtils.isEmpty(string)) {
                A01(ImmutableList.copyOf((Collection) ((C552232g) AnonymousClass0wJ.A0f(C18180wK.A0L(string), 7)).A00));
            }
            if (!TextUtils.isEmpty(string2)) {
                for (AnonymousClass3FU r2 : ImmutableList.copyOf((Collection) C36432Rh.parseFromJson(C18180wK.A0L(string2)).A00)) {
                    this.A01.put(r2.A00(), r2);
                }
            }
        } catch (IOException e) {
            C10450iM.A03("DeferredAccountHelper", C18230wP.A0t("Malformed cached deferred accounts. Error:", e));
        }
    }

    private void A01(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3H7 r2 = (AnonymousClass3H7) it.next();
            if (this.A01.remove(r2.A00()) != null) {
                A04(this.A01.values());
            }
            this.A00.put(r2.A00(), r2);
        }
    }

    public final void A03(Collection collection) {
        try {
            A01(collection);
            LinkedList linkedList = new LinkedList(this.A00.values());
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            Iterator A0t = C18190wL.A0t(A0K, "account_list", linkedList);
            while (A0t.hasNext()) {
                AnonymousClass3H7 r2 = (AnonymousClass3H7) A0t.next();
                if (r2 != null) {
                    A0K.A0J();
                    String str = r2.A01;
                    if (str != null) {
                        A0K.A0d("main_account_id", str);
                    }
                    String str2 = r2.A02;
                    if (str2 != null) {
                        A0K.A0d("one_tap_nonce", str2);
                    }
                    if (r2.A00 != null) {
                        A0K.A0U("user_info");
                        AnonymousClass37A r1 = r2.A00;
                        A0K.A0J();
                        if (r1.A01 != null) {
                            A0K.A0U("user");
                            AnonymousClass3PL.A00(A0K, r1.A01);
                        }
                        A0K.A0c("link_time", r1.A00);
                        A0K.A0G();
                    }
                    A0K.A0G();
                }
            }
            A0K.A0F();
            String A0h = C18180wK.A0h(A0K, A0d);
            C08350dD A002 = C08360dF.A00();
            C04220Ms.A0B(A0h, 0);
            C18180wK.A0v(C18220wO.A0B(A002), "deferred_account_data", A0h);
        } catch (IOException e) {
            C10450iM.A03("DeferredAccountHelper", C18230wP.A0t("Unable to save deferred accounts. Error: ", e));
        }
    }
}
