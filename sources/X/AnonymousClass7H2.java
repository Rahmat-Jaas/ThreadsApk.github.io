package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;
import com.facebookpay.widget.listcell.ListCell;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.7H2  reason: invalid class name */
public final class AnonymousClass7H2 {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        if (r1 != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(X.C148488rA r3) {
        /*
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            java.lang.String r0 = r3.BEK()
            if (r0 == 0) goto L_0x009e
            boolean r0 = X.AnonymousClass8bQ.A0n(r0)
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = r3.APZ()
            if (r0 == 0) goto L_0x009e
            boolean r0 = X.AnonymousClass8bQ.A0n(r0)
            if (r0 != 0) goto L_0x009e
            java.lang.StringBuilder r2 = X.C18200wM.A0r()
            java.lang.String r0 = r3.BEK()
            r2.append(r0)
            java.lang.String r1 = ", "
            r2.append(r1)
            java.lang.String r0 = r3.BEL()
            if (r0 == 0) goto L_0x0042
            boolean r0 = X.AnonymousClass8bQ.A0n(r0)
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = r3.BEL()
            r2.append(r0)
            r2.append(r1)
        L_0x0042:
            java.lang.String r0 = r3.APZ()
            r2.append(r0)
            java.lang.String r0 = r3.APe()
            if (r0 == 0) goto L_0x0055
            boolean r0 = X.AnonymousClass8bQ.A0n(r0)
            if (r0 == 0) goto L_0x0066
        L_0x0055:
            java.lang.String r0 = r3.BMp()
            if (r0 == 0) goto L_0x0061
            boolean r0 = X.AnonymousClass8bQ.A0n(r0)
            if (r0 == 0) goto L_0x0066
        L_0x0061:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x0066:
            java.lang.String r0 = ","
            r2.append(r0)
            java.lang.String r0 = r3.APe()
            if (r0 == 0) goto L_0x0078
            boolean r1 = X.AnonymousClass8bQ.A0n(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0079
        L_0x0078:
            r0 = 1
        L_0x0079:
            java.lang.String r1 = " "
            if (r0 != 0) goto L_0x0087
            r2.append(r1)
            java.lang.String r0 = r3.APe()
            r2.append(r0)
        L_0x0087:
            java.lang.String r0 = r3.BMp()
            if (r0 == 0) goto L_0x0061
            boolean r0 = X.AnonymousClass8bQ.A0n(r0)
            if (r0 != 0) goto L_0x0061
            r2.append(r1)
            java.lang.String r0 = r3.BMp()
            r2.append(r0)
            goto L_0x0061
        L_0x009e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7H2.A01(X.8rA):java.lang.String");
    }

    public static final void A02(BaseSelectionCheckoutItem baseSelectionCheckoutItem, ListCell listCell, String str, String str2) {
        Integer num;
        Context context;
        int i;
        C879155g r2;
        int intValue = baseSelectionCheckoutItem.BA9().intValue();
        ListCell listCell2 = listCell;
        String str3 = str;
        String str4 = str2;
        if (intValue == 3) {
            num = AnonymousClass006.A02;
            context = listCell2.getContext();
            i = 2131826634;
        } else if (intValue != 2) {
            num = AnonymousClass006.A01;
            context = listCell2.getContext();
            i = 2131826462;
        } else {
            r2 = new C879155g(listCell2, AnonymousClass006.A02, (String) null, str3, str4, false, true);
            C006702y.A0C(listCell2, r2);
        }
        r2 = new C879155g(listCell2, num, context.getString(i), str3, str4, false, false);
        C006702y.A0C(listCell2, r2);
    }

    public final SpannableStringBuilder A03(Context context, Date date, Date date2, Locale locale, boolean z) {
        String format;
        int length;
        Date date3 = date2;
        Date date4 = date;
        if (date == null && date2 == null) {
            return null;
        }
        Locale locale2 = locale;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd", locale2);
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.add(5, 1);
        Date date5 = date4;
        if (date == null) {
            date5 = date3;
        }
        Calendar instance3 = Calendar.getInstance();
        instance3.setTime(date5);
        Context context2 = context;
        SpannableStringBuilder A0E = C18200wM.A0E(C86104wH.A11(AnonymousClass00U.A0A(context2.getString(2131826435), ' '), locale2, new Object[0], 0));
        int length2 = A0E.length();
        C04220Ms.A06(instance);
        if (!(instance.get(1) == instance3.get(1) && instance.get(2) == instance3.get(2) && instance.get(5) == instance3.get(5)) && !instance.after(instance3)) {
            if (instance3.after(instance) && instance2.get(1) == instance3.get(1) && instance2.get(2) == instance3.get(2) && instance2.get(5) == instance3.get(5)) {
                String A0l = AnonymousClass0wJ.A0l(context2, simpleDateFormat.format(date5), 2131826432);
                C04220Ms.A06(A0l);
                format = String.format(locale2, A0l, Arrays.copyOf(new Object[0], 0));
            } else if (date == null || date2 == null) {
                format = simpleDateFormat.format(date5);
                A0E.append(format);
                length = A0E.length();
            } else {
                format = String.format("%1s - %2s", C86144wL.A1a(simpleDateFormat.format(date4), simpleDateFormat.format(date3)));
            }
            C04220Ms.A06(format);
            A0E.append(format);
            length = A0E.length();
        } else {
            String A0l2 = AnonymousClass0wJ.A0l(context2, simpleDateFormat.format(date5), 2131826433);
            C04220Ms.A06(A0l2);
            A0E.append(C86104wH.A11(A0l2, locale2, new Object[0], 0));
            length = A0E.length();
            if (instance3.after(instance)) {
                String string = context2.getString(2131826434, C18210wN.A1X(instance3.get(11) - instance.get(11)));
                C04220Ms.A06(string);
                A0E.append(AnonymousClass00U.A0L(", ", C86104wH.A11(string, locale2, new Object[0], 0)));
                length++;
            }
        }
        if (!z) {
            return A0E;
        }
        A0E.setSpan(new StyleSpan(1), length2, length, 33);
        return A0E;
    }

    public static final String A00(Context context, CurrencyAmount currencyAmount) {
        String A0L;
        if (currencyAmount != null) {
            String str = currencyAmount.A01;
            if (!(!AnonymousClass8bQ.A0m(str) || Double.parseDouble(str) == 0.0d || (A0L = AnonymousClass00U.A0L(Currency.getInstance(currencyAmount.A00).getSymbol(), str)) == null)) {
                return A0L;
            }
        }
        return AnonymousClass0wJ.A0k(context, 2131826614);
    }

    public final String A04(Context context, CurrencyAmount currencyAmount, String str, Date date, Date date2, Locale locale) {
        int i;
        Object[] objArr;
        String str2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd", locale);
        if (date != null) {
            if (date2 != null) {
                i = 2131826446;
                String format = simpleDateFormat.format(date);
                String format2 = simpleDateFormat.format(date2);
                if (currencyAmount == null || (str2 = AnonymousClass00U.A0L(Currency.getInstance(currencyAmount.A00).getSymbol(), currencyAmount.A01)) == null) {
                    str2 = AnonymousClass0wJ.A0k(context, 2131826614);
                }
                objArr = new Object[]{format, format2, str2};
            }
            i = 2131826447;
            if ((date == null || (r2 = simpleDateFormat.format(date)) == null) && (date2 == null || (r2 = simpleDateFormat.format(date2)) == null)) {
                String str3 = "";
            }
            if (currencyAmount == null || (r0 = AnonymousClass00U.A0L(Currency.getInstance(currencyAmount.A00).getSymbol(), currencyAmount.A01)) == null) {
                String str4 = AnonymousClass0wJ.A0k(context, 2131826614);
            }
            objArr = new Object[]{str3, str4};
        } else {
            if (date2 == null) {
                return C86104wH.A11("%1s • %2s", locale, new Object[]{str, A00(context, currencyAmount)}, 2);
            }
            i = 2131826447;
            String str32 = "";
            String str42 = AnonymousClass0wJ.A0k(context, 2131826614);
            objArr = new Object[]{str32, str42};
        }
        String string = context.getString(i, objArr);
        C04220Ms.A06(string);
        return string;
    }
}
