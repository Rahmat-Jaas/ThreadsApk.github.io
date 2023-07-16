package kotlin.coroutines.jvm.internal;

import X.C11630kW;
import X.C146958n9;
import X.C18210wN;
import X.C27236EjA;
import com.instagram.barcelona.profile.followinggraph.data.FollowerListDataSource;
import com.instagram.groupprofiles.data.GroupProfileRepository;
import com.instagram.mainfeed.network.FlashFeedCache;
import com.instagram.newsfeed.followrequests.data.FollowRequestsRepository;
import com.instagram.newsfeed.followrequests.data.FollowRequestsRepositoryLegacy;
import com.instagram.reels.draft.migrators.StoryDraftMigrator;
import com.instagram.user.model.User;
import java.util.List;

public class KtCImplShape0S0411000_I2 extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S0411000_I2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A06 = i;
        this.A04 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCImplShape0S0411000_I2) || ((KtCImplShape0S0411000_I2) obj).A06 != i) {
            return false;
        }
        return true;
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                return FollowerListDataSource.A00((FollowerListDataSource) C18210wN.A0Z(obj, this), (String) null, (String) null, this, false);
            case 1:
                return ((GroupProfileRepository) C18210wN.A0Z(obj, this)).A05((C11630kW) null, (User) null, this, false);
            case 2:
                return ((FlashFeedCache) C18210wN.A0Z(obj, this)).A04(this, false);
            case 3:
                return ((FollowRequestsRepository) C18210wN.A0Z(obj, this)).AKt((List) null, this, false);
            case 4:
                return ((FollowRequestsRepositoryLegacy) C18210wN.A0Z(obj, this)).AKt((List) null, this, false);
            default:
                return StoryDraftMigrator.A00((StoryDraftMigrator) C18210wN.A0Z(obj, this), this, false);
        }
    }
}
