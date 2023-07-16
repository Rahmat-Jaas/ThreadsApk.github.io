package X;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.instagram.barcelona.R;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3vj  reason: invalid class name and case insensitive filesystem */
public final class C65763vj implements ListAdapter {
    public String A00 = "";
    public final Comparator A01 = C73624Td.A00;
    public final List A02 = AnonymousClass0wJ.A0v();
    public final Context A03;
    public final DataSetObservable A04 = new DataSetObservable();
    public final List A05 = AnonymousClass0wJ.A0v();

    public final boolean areAllItemsEnabled() {
        return true;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C57193Ac r4;
        SpannableStringBuilder append;
        String str;
        if (view == null) {
            view = LayoutInflater.from(this.A03).inflate(R.layout.quick_promotion_slot_item, viewGroup, false);
            r4 = new C57193Ac(view);
            view.setTag(r4);
        } else {
            r4 = (C57193Ac) C18210wN.A0X(view);
        }
        AnonymousClass3HO r6 = (AnonymousClass3HO) getItem(i);
        if (r6 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Map map = r6.A03;
            Iterator A0z = AnonymousClass0wJ.A0z(r6.A02);
            int i2 = 0;
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                QuickPromotionSurface quickPromotionSurface = ((C40337Lct) A0o.getKey()).A00;
                StringBuilder A0s = C18190wL.A0s("\n");
                String lowerCase = quickPromotionSurface.name().toLowerCase();
                A0s.append(lowerCase);
                A0s.append("\n");
                SpannableString spannableString = new SpannableString(AnonymousClass00U.A0V("\n", lowerCase, "\n"));
                spannableString.setSpan(new C18640xY(), 0, A0s.length(), 0);
                spannableStringBuilder.append(spannableString);
                List<C57833Cq> list = (List) A0o.getValue();
                if (list == null || list.isEmpty()) {
                    spannableStringBuilder.append("No QPs\n");
                } else {
                    for (C57833Cq r2 : list) {
                        AnonymousClass3GI r8 = r2.A02;
                        if (r8 == null) {
                            AnonymousClass0LU.A0B("QuickPromotionDebugSlotItemAdapter", "Should not happen: Edge contains no node!");
                            append = spannableStringBuilder.append("No node for edge ");
                            str = r2.toString();
                        } else {
                            SpannableStringBuilder append2 = spannableStringBuilder.append("\"");
                            List list2 = r8.A06;
                            list2.getClass();
                            append2.append(((C28221tt) list2.get(0)).A09.A00).append("\" ");
                            Object obj = map.get(r2.A02.A05);
                            obj.getClass();
                            C62573aJ r22 = (C62573aJ) obj;
                            String str2 = r22.A00;
                            if (str2 == null) {
                                str2 = "";
                            }
                            if (r22.A02) {
                                spannableStringBuilder.append(" is qualified.\n");
                                if (r22.A01) {
                                    spannableStringBuilder.append(str2);
                                }
                                i2++;
                            } else {
                                append = spannableStringBuilder.append("is not qualified: ").append(str2);
                                str = ".\n";
                            }
                        }
                        append.append(str);
                    }
                }
            }
            r4.A02.setText(r6.A00.name().replace('_', ' '));
            r4.A01.setText(String.format("%d qualified promotion(s)", C18210wN.A1X(i2)));
            r4.A00.setText(spannableStringBuilder);
            return view;
        }
        throw C18250wR.A0V(AnonymousClass00U.A0J("Failed to get an item at position ", i));
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public static void A00(C65763vj r6) {
        List list = r6.A05;
        list.clear();
        for (AnonymousClass3HO r3 : r6.A02) {
            if (C18240wQ.A0g(r3.A00.name().replace('_', ' ')).contains(r6.A00)) {
                list.add(r3);
            }
        }
        boolean isEmpty = list.isEmpty();
        DataSetObservable dataSetObservable = r6.A04;
        if (!isEmpty) {
            dataSetObservable.notifyChanged();
        } else {
            dataSetObservable.notifyInvalidated();
        }
    }

    public final int getCount() {
        return this.A05.size();
    }

    public final Object getItem(int i) {
        List list = this.A05;
        if (list.size() > i) {
            return list.get(i);
        }
        return null;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.A04.registerObserver(dataSetObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.A04.unregisterObserver(dataSetObserver);
    }

    public C65763vj(Context context) {
        this.A03 = context;
    }

    public final long getItemId(int i) {
        AnonymousClass3HO r0 = (AnonymousClass3HO) getItem(i);
        if (r0 != null) {
            return (long) r0.A00.ordinal();
        }
        return -1;
    }

    public final boolean isEmpty() {
        return C18180wK.A1W(getCount());
    }

    public final boolean isEnabled(int i) {
        return AnonymousClass0wJ.A1W(getItem(i));
    }
}
