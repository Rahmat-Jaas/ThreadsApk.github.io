package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape6S0201000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.model.reels.Reel;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.0y1  reason: invalid class name and case insensitive filesystem */
public final class C18860y1 extends BaseAdapter {
    public View A00;
    public List A01 = AnonymousClass0wJ.A0v();
    public boolean A02 = false;
    public boolean A03 = false;
    public final List A04 = AnonymousClass0wJ.A0v();
    public final Context A05;
    public final C11630kW A06;
    public final C23401dk A07;
    public final UserSession A08;
    public final C28164EzZ A09;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        int i2 = 3;
        if (i == 0) {
            return 3;
        }
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 5;
        }
        for (C58523Fz r2 : this.A04) {
            if (i >= i2) {
                int i3 = r2.A01;
                if (i < i3 + i2) {
                    int i4 = i - i2;
                    if (i4 == 0) {
                        return 0;
                    }
                    if (i4 != i3 - 1) {
                        return 1;
                    }
                    if (r2.A00 < r2.A05.size() || r2.A02 != null) {
                        return 2;
                    }
                    return 1;
                }
            }
            i2 += r2.A01;
        }
        return -1;
    }

    public final int getViewTypeCount() {
        return 6;
    }

    public final int getCount() {
        if (this.A03) {
            return 4;
        }
        int i = 3;
        if (this.A02) {
            return this.A01.size() + 3;
        }
        for (C58523Fz r0 : this.A04) {
            i += r0.A01;
        }
        return i;
    }

    public final Object getItem(int i) {
        int i2 = 3;
        for (C58523Fz r2 : this.A04) {
            if (i >= i2) {
                int i3 = r2.A01;
                if (i < i3 + i2) {
                    int i4 = i - i2;
                    if (i4 == 0) {
                        return r2.A04;
                    }
                    if (i4 != i3 - 1 || (r2.A00 >= r2.A05.size() && r2.A02 == null)) {
                        return r2.A05.get(i4 - 1);
                    }
                    return null;
                }
            }
            i2 += r2.A01;
        }
        return null;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View A002;
        DZ5 dz5;
        UserSession userSession;
        Object item;
        String A0l;
        LayoutInflater layoutInflater;
        int i2;
        int i3 = i;
        ViewGroup viewGroup2 = viewGroup;
        View view2 = view;
        Context context = viewGroup2.getContext();
        if (context == null) {
            return view;
        }
        if (!this.A03 || i3 < 3) {
            if (!this.A02 || i3 < 3) {
                int itemViewType = getItemViewType(i3);
                if (itemViewType == 0) {
                    View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(context), viewGroup2, R.layout.sac_nux_follow_accounts_header_row);
                    A0H.setTag(new AnonymousClass35P(A0H));
                    if (getItem(i3) == null) {
                        return A0H;
                    }
                    String BK7 = ((User) getItem(i3)).BK7();
                    TextView textView = ((AnonymousClass35P) C18210wN.A0X(A0H)).A00;
                    textView.setText(AnonymousClass0wJ.A0l(textView.getContext(), BK7, 2131827581));
                    return A0H;
                } else if (itemViewType == 1) {
                    A002 = C25208Dhn.A00(context, viewGroup2);
                    if (getItem(i3) == null) {
                        return A002;
                    }
                    dz5 = (DZ5) C18210wN.A0X(A002);
                    userSession = this.A08;
                    item = getItem(i3);
                } else if (itemViewType != 2) {
                    if (itemViewType == 3) {
                        layoutInflater = LayoutInflater.from(context);
                        i2 = R.layout.sac_nux_follow_accounts_page_header_row;
                    } else if (itemViewType == 4) {
                        layoutInflater = LayoutInflater.from(context);
                        i2 = R.layout.sac_nux_follow_accounts_description_row;
                    } else if (itemViewType != 5) {
                        return view2;
                    } else {
                        View view3 = this.A00;
                        view3.getClass();
                        return view3;
                    }
                    return layoutInflater.inflate(i2, viewGroup2, false);
                } else {
                    View A0H2 = AnonymousClass0wJ.A0H(LayoutInflater.from(context), viewGroup2, R.layout.sac_nux_follow_accounts_see_more_row);
                    A0H2.setTag(new AnonymousClass35Q(A0H2));
                    int i4 = 3;
                    for (C58523Fz r7 : this.A04) {
                        if (i3 < i4 || i3 >= r7.A01 + i4) {
                            i4 += r7.A01;
                        } else {
                            AnonymousClass35Q r9 = (AnonymousClass35Q) C18210wN.A0X(A0H2);
                            int size = r7.A05.size();
                            int i5 = r7.A00;
                            Integer A0o = r7.A04.A0o();
                            int i6 = size - i5;
                            int i7 = 10;
                            if (r7.A03) {
                                i7 = 50;
                            }
                            if (i6 >= i7) {
                                i6 = i7;
                            } else if (r7.A02 != null) {
                                if (A0o != null) {
                                    i6 = Math.min(A0o.intValue() - i5, i7);
                                } else {
                                    i6 = -1;
                                }
                            }
                            C23401dk r5 = this.A07;
                            TextView textView2 = r9.A00;
                            Context context2 = textView2.getContext();
                            if (i6 == -1) {
                                A0l = context2.getString(2131827582);
                            } else {
                                A0l = AnonymousClass0wJ.A0l(context2, Integer.valueOf(i6), 2131827583);
                            }
                            textView2.setText(A0l);
                            textView2.setOnClickListener(new IDxCListenerShape6S0201000_1_I2(i6, 3, r7, r5));
                            return A0H2;
                        }
                    }
                    return A0H2;
                }
            } else {
                A002 = C25208Dhn.A00(context, viewGroup2);
                dz5 = (DZ5) C18210wN.A0X(A002);
                userSession = this.A08;
                item = this.A01.get(i - 3);
            }
            C28164EzZ ezZ = this.A09;
            C25208Dhn.A01(this.A05, this.A06, (Reel) null, userSession, (User) item, (C23937D1z) null, (C25386Dkl) null, ezZ, dz5, false, false, false, true, false, false, false, false, false);
            return A002;
        }
        View A003 = C50362ss.A00(LayoutInflater.from(context), viewGroup2);
        AnonymousClass39B r2 = (AnonymousClass39B) C18210wN.A0X(A003);
        String string = context.getResources().getString(2131831836);
        C04220Ms.A0B(r2, 0);
        r2.A01.setText(string);
        return A003;
    }

    public C18860y1(Context context, C11630kW r3, C23401dk r4, UserSession userSession, C28164EzZ ezZ) {
        this.A05 = context;
        this.A08 = userSession;
        this.A07 = r4;
        this.A09 = ezZ;
        this.A06 = r3;
    }
}
