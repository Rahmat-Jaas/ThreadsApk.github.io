package X;

import android.util.LongSparseArray;
import com.facebook.rendercore.RenderTreeNode;
import java.util.List;
import java.util.Locale;

/* renamed from: X.7Di  reason: invalid class name */
public final class AnonymousClass7Di {
    public final int A00;
    public final int A01;
    public final int A02;
    public final LongSparseArray A03 = new LongSparseArray();
    public final RenderTreeNode A04;
    public final List A05;
    public final RenderTreeNode[] A06;

    public static int A00(AnonymousClass7Di r0) {
        return r0.A04.A04.height();
    }

    public static int A01(AnonymousClass7Di r0) {
        return r0.A04.A04.width();
    }

    public AnonymousClass7Di(RenderTreeNode renderTreeNode, List list, RenderTreeNode[] renderTreeNodeArr, int i, int i2, int i3) {
        this.A04 = renderTreeNode;
        this.A06 = renderTreeNodeArr;
        this.A02 = i;
        this.A00 = i2;
        this.A05 = list;
        this.A01 = i3;
        int i4 = 0;
        while (true) {
            RenderTreeNode[] renderTreeNodeArr2 = this.A06;
            if (i4 < renderTreeNodeArr2.length) {
                RenderTreeNode renderTreeNode2 = renderTreeNodeArr2[i4];
                LongSparseArray longSparseArray = this.A03;
                if (longSparseArray.get(renderTreeNode2.A07.A08()) == null) {
                    this.A03.put(this.A06[i4].A07.A08(), Integer.valueOf(i4));
                    i4++;
                } else {
                    Integer num = (Integer) longSparseArray.get(renderTreeNode2.A07.A08());
                    RenderTreeNode renderTreeNode3 = renderTreeNodeArr2[num.intValue()];
                    Locale locale = Locale.US;
                    Integer valueOf = Integer.valueOf(i4);
                    String A002 = renderTreeNode2.A00((AnonymousClass7Di) null);
                    String A003 = renderTreeNode3.A00((AnonymousClass7Di) null);
                    StringBuilder A0r = C18200wM.A0r();
                    String A004 = AnonymousClass7I7.A00(this.A02);
                    String A005 = AnonymousClass7I7.A00(this.A00);
                    A0r.append("RenderTree details:\n");
                    A0r.append(String.format(locale, "WidthSpec=%s; HeightSpec=%s\n", new Object[]{A004, A005}));
                    A0r.append(String.format(locale, "Full child list (size = %d):\n", C18210wN.A1X(r3)));
                    for (RenderTreeNode A006 : this.A06) {
                        A0r.append(String.format(locale, "%s\n", new Object[]{A006.A00(this)}));
                    }
                    throw C18180wK.A0a(String.format(locale, "RenderTrees must not have RenderUnits with the same ID:\nAttempted to add item with existing ID at index %d: %s\nExisting item at index %d: %s\nFull RenderTree: %s", new Object[]{valueOf, A002, num, A003, A0r.toString()}));
                }
            } else {
                return;
            }
        }
    }
}
