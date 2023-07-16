package androidx.room.migration;

import X.C04220Ms;
import X.C34094I0o;
import X.Lr4;
import com.instagram.react.modules.base.IgReactQEModule;

public class IDxMigrationShape19S0000000_2_I2 extends Lr4 {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IDxMigrationShape19S0000000_2_I2(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0043;
                case 2: goto L_0x003e;
                case 3: goto L_0x0039;
                case 4: goto L_0x0034;
                case 5: goto L_0x002f;
                case 6: goto L_0x002a;
                case 7: goto L_0x0025;
                case 8: goto L_0x0048;
                case 9: goto L_0x0022;
                case 10: goto L_0x001f;
                case 11: goto L_0x001c;
                case 12: goto L_0x0019;
                case 13: goto L_0x0016;
                case 14: goto L_0x0012;
                case 15: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            r1 = 9
            r0 = 10
        L_0x0009:
            r2.<init>(r1, r0)
            return
        L_0x000d:
            r1 = 8
            r0 = 9
            goto L_0x0009
        L_0x0012:
            r1 = 7
            r0 = 8
            goto L_0x0009
        L_0x0016:
            r1 = 6
            r0 = 7
            goto L_0x0009
        L_0x0019:
            r1 = 5
            r0 = 6
            goto L_0x0009
        L_0x001c:
            r1 = 4
            r0 = 5
            goto L_0x0009
        L_0x001f:
            r1 = 3
            r0 = 4
            goto L_0x0009
        L_0x0022:
            r1 = 2
            r0 = 3
            goto L_0x0009
        L_0x0025:
            r1 = 16
            r0 = 17
            goto L_0x0009
        L_0x002a:
            r1 = 15
            r0 = 16
            goto L_0x0009
        L_0x002f:
            r1 = 14
            r0 = 15
            goto L_0x0009
        L_0x0034:
            r1 = 13
            r0 = 14
            goto L_0x0009
        L_0x0039:
            r1 = 12
            r0 = 13
            goto L_0x0009
        L_0x003e:
            r1 = 11
            r0 = 12
            goto L_0x0009
        L_0x0043:
            r1 = 10
            r0 = 11
            goto L_0x0009
        L_0x0048:
            r1 = 1
            r0 = 2
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.migration.IDxMigrationShape19S0000000_2_I2.<init>(int):void");
    }

    public final void A00(C34094I0o i0o) {
        String str;
        switch (this.A00) {
            case 0:
                C04220Ms.A0B(i0o, 0);
                str = "\n          ALTER TABLE mini_gallery_categories\n          ADD COLUMN isDefaultCategory INTEGER NOT NULL DEFAULT 0\n        ";
                break;
            case 1:
                C04220Ms.A0B(i0o, 0);
                str = "\n          ALTER TABLE effects\n          ADD COLUMN isUserSafetyWarningRequired INTEGER NOT NULL DEFAULT 0\n        ";
                break;
            case 2:
                C04220Ms.A0B(i0o, 0);
                str = "\n          ALTER TABLE effects\n          ADD COLUMN usesFlmCapability INTEGER NOT NULL DEFAULT 0\n        ";
                break;
            case 3:
                C04220Ms.A0B(i0o, 0);
                str = "\n          ALTER TABLE effects\n          ADD COLUMN creativeToolDescription TEXT\n        ";
                break;
            case 4:
                C04220Ms.A0B(i0o, 0);
                str = "\n          ALTER TABLE effects\n          ADD COLUMN formattedMediaCount TEXT\n        ";
                break;
            case 5:
                C04220Ms.A0B(i0o, 0);
                str = "\n          ALTER TABLE effects\n          ADD COLUMN formattedMediaCountAccessibility TEXT\n        ";
                break;
            case 6:
                C04220Ms.A0B(i0o, 0);
                str = "\n          ALTER TABLE effects\n          ADD COLUMN avatarSdkPresetGlb TEXT\n        ";
                break;
            case 7:
                C04220Ms.A0B(i0o, 0);
                i0o.AKi("\n          ALTER TABLE effects\n          ADD COLUMN requiredSdkVersion TEXT\n        ");
                str = "\n          ALTER TABLE effects\n          ADD COLUMN bestInstanceId TEXT\n        ";
                break;
            case 8:
                C04220Ms.A0B(i0o, 0);
                i0o.AKi("\n          ALTER TABLE effects\n          ADD COLUMN useHandsFree INTEGER NOT NULL DEFAULT 0\n        ");
                str = "\n          ALTER TABLE effects\n          ADD COLUMN handsFreeDurationMs INTEGER NOT NULL DEFAULT 0\n        ";
                break;
            case 9:
                C04220Ms.A0B(i0o, 0);
                str = "\n          ALTER TABLE effects\n          ADD COLUMN isEncrypted INTEGER NOT NULL DEFAULT 0\n        ";
                break;
            case 10:
                C04220Ms.A0B(i0o, 0);
                str = "\n          ALTER TABLE effect_collections\n          ADD COLUMN hasMore INTEGER NOT NULL DEFAULT 0\n        ";
                break;
            case 11:
                C04220Ms.A0B(i0o, 0);
                str = "\n          ALTER TABLE effects\n          ADD COLUMN syncedAt INTEGER NOT NULL DEFAULT 0\n        ";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C04220Ms.A0B(i0o, 0);
                str = "\n          ALTER TABLE effects\n          ADD COLUMN shaderPackMetadata TEXT\n        ";
                break;
            case 13:
                C04220Ms.A0B(i0o, 0);
                str = "\n          ALTER TABLE effects\n          ADD COLUMN productCapabilities TEXT NOT NULL DEFAULT \"\"\n        ";
                break;
            case 14:
                C04220Ms.A0B(i0o, 0);
                str = "\n          ALTER TABLE effects\n          ADD COLUMN transparentBackgroundThumbnailUrl TEXT\n        ";
                break;
            case 15:
                C04220Ms.A0B(i0o, 0);
                str = "\n          ALTER TABLE effects\n          ADD COLUMN fanClubId TEXT\n        ";
                break;
            default:
                C04220Ms.A0B(i0o, 0);
                str = "\n          ALTER TABLE effects\n          ADD COLUMN isCreativeTool INTEGER NOT NULL DEFAULT 0\n        ";
                break;
        }
        i0o.AKi(str);
    }
}
