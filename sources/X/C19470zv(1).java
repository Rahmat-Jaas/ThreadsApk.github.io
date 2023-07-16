package X;

import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository;

/* renamed from: X.0zv  reason: invalid class name and case insensitive filesystem */
public final class C19470zv extends C62793ak {
    public final FanClubSettingsRecommendationsRepository A00;
    public final C62723ab A01;
    public final C84714tk A02;
    public final boolean A03;

    public C19470zv(FanClubSettingsRecommendationsRepository fanClubSettingsRecommendationsRepository, C62723ab r5, boolean z) {
        C86094wG r2;
        int i;
        C04220Ms.A0B(fanClubSettingsRecommendationsRepository, 1);
        this.A00 = fanClubSettingsRecommendationsRepository;
        this.A01 = r5;
        this.A03 = z;
        if (z) {
            r2 = fanClubSettingsRecommendationsRepository.A01;
            i = 18;
        } else {
            r2 = fanClubSettingsRecommendationsRepository.A02;
            i = 19;
        }
        this.A02 = new IDxFlowShape93S0200000_1_I2(i, (Object) this, (Object) r2);
    }
}
