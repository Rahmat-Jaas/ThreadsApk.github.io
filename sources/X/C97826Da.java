package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.6Da  reason: invalid class name and case insensitive filesystem */
public final class C97826Da {
    public static final void A00(C967266l r2, long j) {
        C04220Ms.A0B(r2, 1);
        if (r2 == C967266l.Vertical) {
            if (Constraints.A01(j) == Integer.MAX_VALUE) {
                throw C18180wK.A0a("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (Constraints.A02(j) == Integer.MAX_VALUE) {
            throw C18180wK.A0a("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }
}
