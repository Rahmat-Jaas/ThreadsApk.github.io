package X;

import android.content.Context;
import android.view.View;
import com.facebook.redex.IDxCListenerShape345S0100000_1_I2;
import com.facebook.redex.IDxPredicateShape351S0100000_1_I2;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Jz  reason: invalid class name and case insensitive filesystem */
public final class C71734Jz implements C33534HpU, C83604rg {
    public C33900Hwe A00;
    public boolean A01;
    public final View A02;
    public final InlineSearchBox A03;
    public final UserSession A04;
    public final AnonymousClass1fV A05;
    public final Context A06;
    public final AnonymousClass06E A07;

    public final void CDk(C33900Hwe hwe) {
        AnonymousClass1fV r4;
        C04220Ms.A0B(hwe, 0);
        if (this.A01) {
            String B5H = hwe.B5H();
            C04220Ms.A06(B5H);
            if (B5H.length() == 0) {
                r4 = this.A05;
                List<Object> list = r4.A0D;
                if (C18190wL.A1a(C18220wO.A0S(list))) {
                    r4.clear();
                    for (Object addModel : list) {
                        r4.addModel(addModel, r4.A07);
                    }
                    r4.notifyDataSetChangedSmart();
                }
            }
            r4 = this.A05;
            Object B80 = hwe.B80();
            C04220Ms.A06(B80);
            List list2 = (List) B80;
            boolean BVe = hwe.BVe();
            C04220Ms.A0B(list2, 0);
            r4.clear();
            if (BVe) {
                r4.addModel(r4.A0E.getValue(), r4.A0F.getValue(), r4.A0B);
            } else if (list2.isEmpty()) {
                r4.addModel(r4.A06.getString(2131831836), r4.A0A);
            } else {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    User A0c = C18220wO.A0c(it);
                    List list3 = r4.A0C;
                    boolean z = false;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it2 = list3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (C04220Ms.A0I(((AnonymousClass395) it2.next()).A01, A0c)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    r4.addModel(new AnonymousClass395(A0c, z), r4.A07);
                }
            }
            r4.notifyDataSetChangedSmart();
        }
    }

    public final void onSearchCleared(String str) {
    }

    public final void onSearchTextChanged(String str) {
        C04220Ms.A0B(str, 0);
        C33900Hwe hwe = this.A00;
        if (hwe == null) {
            C04220Ms.A0E("searchProvider");
            throw null;
        } else {
            hwe.Coi(str);
        }
    }

    public final void A00(String str, String str2) {
        String A002 = I17.A00(11);
        C04220Ms.A0B(str, 1);
        UserSession userSession = this.A04;
        C33900Hwe A003 = C35779J3p.A00(new IDxPredicateShape351S0100000_1_I2(this, 2), new H8Q(this.A06, this.A07), new AnonymousClass4K3(this, str, str2), userSession, A002, (List) null, true);
        this.A00 = A003;
        A003.Cmd(this);
    }

    public C71734Jz(Context context, View view, AnonymousClass06E r5, InlineSearchBox inlineSearchBox, UserSession userSession, AnonymousClass1fV r8) {
        AnonymousClass0wJ.A1Q(userSession, inlineSearchBox);
        this.A06 = context;
        this.A04 = userSession;
        this.A03 = inlineSearchBox;
        this.A02 = view;
        this.A07 = r5;
        this.A05 = r8;
        A00("users/search/", "top_search_page");
        inlineSearchBox.A02 = this;
        inlineSearchBox.A00 = new IDxCListenerShape345S0100000_1_I2(this, 17);
        AnonymousClass0wJ.A17(view, 222, this);
    }
}
