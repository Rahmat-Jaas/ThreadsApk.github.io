package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerState;
import java.util.List;

/* renamed from: X.8nU  reason: invalid class name and case insensitive filesystem */
public interface C147158nU {
    int APz();

    int ATC();

    C967266l Ays();

    int BHd();

    int BLd();

    long BLg();

    int BLh();

    List BLp();

    static List A00(LazyListState lazyListState) {
        return lazyListState.A02().BLp();
    }

    static List A01(PagerState pagerState) {
        return pagerState.A07().BLp();
    }
}
