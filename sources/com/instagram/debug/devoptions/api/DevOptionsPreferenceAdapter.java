package com.instagram.debug.devoptions.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass1fC;
import X.AnonymousClass3TL;
import X.AnonymousClass4MA;
import X.AnonymousClass4MC;
import X.C10300i6;
import X.C11630kW;
import X.C18200wM;
import X.C31103Gfm;
import X.C57573Bp;
import X.C57593Br;
import X.C62133Xg;
import X.C62153Xk;
import X.C63063bP;
import X.C63293hC;
import X.C64533mV;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public class DevOptionsPreferenceAdapter extends AnonymousClass1fC implements Filterable {
    public final Context mContext;
    public final Filter mFilter = new Filter() {
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            int size;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (TextUtils.isEmpty(charSequence)) {
                List list = DevOptionsPreferenceAdapter.this.mUnfilteredItems;
                filterResults.values = list;
                size = list.size();
            } else {
                ArrayList A0v = AnonymousClass0wJ.A0v();
                HashSet A0u = C18200wM.A0u();
                for (Object next : DevOptionsPreferenceAdapter.this.mUnfilteredItems) {
                    if (next instanceof C57593Br) {
                        A0v.add(next);
                    } else if (DevOptionsPreferenceAdapter.this.matches(next, (String) charSequence) && !A0u.contains(DevOptionsPreferenceAdapter.this.getItemTitle(next))) {
                        A0v.add(next);
                        A0u.add(DevOptionsPreferenceAdapter.this.getItemTitle(next));
                    }
                }
                filterResults.values = A0v;
                size = A0v.size();
            }
            filterResults.count = size;
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            DevOptionsPreferenceAdapter.this.setItems((Collection) filterResults.values);
        }
    };
    public final List mUnfilteredItems = AnonymousClass0wJ.A0v();

    /* access modifiers changed from: private */
    public CharSequence getItemTitle(Object obj) {
        Context context;
        int i;
        if (obj instanceof C63293hC) {
            return ((C63293hC) obj).A04;
        }
        if (obj instanceof AnonymousClass4MC) {
            AnonymousClass4MC r3 = (AnonymousClass4MC) obj;
            CharSequence charSequence = r3.A0B;
            if (charSequence != null) {
                return charSequence;
            }
            context = this.mContext;
            i = r3.A04;
        } else if (obj instanceof C57573Bp) {
            context = this.mContext;
            i = ((C57573Bp) obj).A02;
        } else if (obj instanceof C63063bP) {
            context = this.mContext;
            i = ((C63063bP) obj).A02;
        } else if (obj instanceof C64533mV) {
            return ((C64533mV) obj).A03;
        } else {
            if (obj instanceof C62133Xg) {
                C62133Xg r32 = (C62133Xg) obj;
                CharSequence charSequence2 = r32.A05;
                if (charSequence2 != null) {
                    return charSequence2;
                }
                context = this.mContext;
                i = r32.A01;
            } else if (obj instanceof C62153Xk) {
                C62153Xk r33 = (C62153Xk) obj;
                CharSequence charSequence3 = r33.A05;
                if (charSequence3 != null) {
                    return charSequence3;
                }
                context = this.mContext;
                i = r33.A01;
            } else if (obj instanceof AnonymousClass4MA) {
                AnonymousClass4MA r34 = (AnonymousClass4MA) obj;
                CharSequence charSequence4 = r34.A05;
                if (charSequence4 != null) {
                    return charSequence4;
                }
                context = this.mContext;
                i = r34.A02;
            } else if (obj instanceof AnonymousClass3TL) {
                return ((AnonymousClass3TL) obj).A08;
            } else {
                return null;
            }
        }
        return context.getString(i);
    }

    public Filter getFilter() {
        return this.mFilter;
    }

    public void setTypeaheadHeaderModel(C57593Br r3) {
        this.mUnfilteredItems.set(0, r3);
    }

    public void setUnfilteredItems(List list) {
        if (list == null) {
            list = AnonymousClass0wJ.A0v();
        }
        this.mUnfilteredItems.clear();
        this.mUnfilteredItems.addAll(list);
    }

    public DevOptionsPreferenceAdapter(Context context, C10300i6 r3, C11630kW r4) {
        super(context, r3, r4);
        this.mContext = context;
    }

    private String getTitleInitialsLowerCase(String str) {
        StringBuilder A0r = C18200wM.A0r();
        for (String str2 : str.toLowerCase(C31103Gfm.A02()).split(" ")) {
            if (!TextUtils.isEmpty(str2)) {
                int codePointAt = str2.codePointAt(0);
                if (Character.isLetter(codePointAt)) {
                    A0r.appendCodePoint(codePointAt);
                }
            }
        }
        return A0r.toString();
    }

    /* access modifiers changed from: private */
    public boolean matches(Object obj, String str) {
        String str2 = (String) getItemTitle(obj);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        Locale A02 = C31103Gfm.A02();
        String lowerCase = str.toLowerCase(A02);
        if (str2.toLowerCase(A02).contains(lowerCase) || getTitleInitialsLowerCase(str2).startsWith(lowerCase)) {
            return true;
        }
        return false;
    }
}
