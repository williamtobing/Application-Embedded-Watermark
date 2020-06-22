package com.develops.phonearena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.develops.graphlibrary.Hasil;
import com.develops.graphlibrary.Watermark;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> merk = new ArrayList<>();
    private ArrayList<String> spek = new ArrayList<>();
    private ArrayList<String> image = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data();
        try {
            watermark();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void watermark() throws IOException {
//        System.out.println("Hello");
//        //  TextView ascii = findViewById(R.id.n_ascii);
        String watermark = "cdefghijklmnopqrstuvwxyz{|}~";
        Watermark kata= new Watermark(watermark);
        Hasil.buildWatermark(kata.nama_watermark);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.about) {
            Intent about = new Intent(getApplicationContext(), About.class);
            startActivity(about);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void data() {

        Log.d(TAG, "data");

        merk.add("Samsung Galaxy Note10+");
        spek.add("NETWORK\tTechnology\t\n" +
                "GSM / CDMA / HSPA / EVDO / LTE\n" +
                "LAUNCH\tAnnounced\t2019, August\n" +
                "Status\tAvailable. Released 2019, August\n" +
                "BODY\tDimensions\t162.3 x 77.2 x 7.9 mm (6.39 x 3.04 x 0.31 in)\n" +
                "Weight\t196 g (6.91 oz)\n" +
                "Build\tFront/back glass (Gorilla Glass 6), aluminum frame\n" +
                "SIM\tSingle SIM (Nano-SIM) or Hybrid Dual SIM (Nano-SIM, dual stand-by)\n" +
                " \tSamsung Pay (Visa, MasterCard certified)\n" +
                "IP68 dust/water resistant (up to 1.5m for 30 mins)\n" +
                "Stylus (Bluetooth integration, accelerometer, gyro)\n" +
                "DISPLAY\tType\tDynamic AMOLED capacitive touchscreen, 16M colors\n" +
                "Size\t6.8 inches, 114.0 cm2 (~91.0% screen-to-body ratio)\n" +
                "Resolution\t1440 x 3040 pixels, 19:9 ratio (~498 ppi density)\n" +
                "Protection\tCorning Gorilla Glass 6\n" +
                " \tHDR10+\n" +
                "Always-on display\n" +
                "PLATFORM\tOS\tAndroid 9.0 (Pie); One UI\n" +
                "Chipset\tExynos 9825 (7 nm) - EMEA/LATAM\n" +
                "Qualcomm SDM855 Snapdragon 855 (7 nm) - USA/China\n" +
                "CPU\tOcta-core (2x2.73 GHz Mongoose M4 & 2x2.4 GHz Cortex-A75 & 4x1.9 GHz Cortex-A55) - EMEA/LATAM\n" +
                "Octa-core (1x2.84 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.78 GHz Kryo 485) - USA/China\n" +
                "GPU\tMali-G76 MP12 - EMEA/LATAM\n" +
                "Adreno 640 - USA/China\n" +
                "MEMORY\tCard slot\tmicroSD, up to 1 TB (uses shared SIM slot) - dual SIM model only\n" +
                "Internal\t256GB 12GB RAM, 512GB 12GB RAM\n" +
                "MAIN CAMERA\tQuad\t12 MP, f/1.5-2.4, 27mm (wide), 1/2.55\", 1.4µm, Dual Pixel PDAF, OIS\n" +
                "12 MP, f/2.1, 52mm (telephoto), 1/3.6\", 1.0µm, PDAF, OIS, 2x optical zoom\n" +
                "16 MP, f/2.2, 12mm (ultrawide), 1.0µm, Super Steady video\n" +
                "TOF 3D VGA camera\n" +
                "Features\tLED flash, auto-HDR, panorama\n" +
                "Video\t2160p@30/60fps, 1080p@30/60/240fps, 720p@960fps, HDR10+, dual-video rec., stereo sound rec., gyro-EIS & OIS\n" +
                "SELFIE CAMERA\tSingle\t10 MP, f/2.2, 26mm (wide), 1.22µm, Dual Pixel PDAF\n" +
                "Features\tDual video call, Auto-HDR\n" +
                "Video\t2160p@30fps\n" +
                "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                "3.5mm jack\tNo\n" +
                " \t32-bit/384kHz audio\n" +
                "Active noise cancellation with dedicated mic\n" +
                "Dolby Atmos sound\n" +
                "Tuned by AKG\n" +
                "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac/ax, dual-band, Wi-Fi Direct, hotspot\n" +
                "Bluetooth\t5.0, A2DP, LE, aptX\n" +
                "GPS\tYes, with A-GPS, GLONASS, BDS, GALILEO\n" +
                "NFC\tYes\n" +
                "Radio\tFM radio (USA & Canada only)\n" +
                "USB\t3.1, Type-C 1.0 reversible connector\n" +
                "FEATURES\tSensors\tFingerprint (under display, ultrasonic), accelerometer, gyro, proximity, compass, barometer\n" +
                " \tSamsung DeX (desktop experience support)\n" +
                "ANT+\n" +
                "Bixby natural language commands and dictation\n" +
                "BATTERY\t \tNon-removable Li-Ion 4300 mAh battery\n" +
                "Charging\tFast battery charging 45W\n" +
                "USB Power Delivery 3.0\n" +
                "Fast Qi/PMA wireless charging 15W\n" +
                "Power bank/Reverse wireless charging 9W\n" +
                "MISC\tColors\tAura Glow, Aura White, Aura Black, Aura Blue\n" +
                "Models\tSM-N975F, SM-N975U, SM-N9750, SM-N975U1, SM-N975W, SM-N975N\n" +
                "SAR\t0.35 W/kg (head)     0.70 W/kg (body)    \n" +
                "SAR EU\t0.19 W/kg (head)     1.40 W/kg (body)    \n" +
                "Price\t$ 899.00 / £ 751.36 / ₹ 79,999\n" +
                "TESTS\tPerformance\tBasemark OS II: 4544 / Basemark OS II 2.0: 4841\n" +
                "Basemark X: 45007\n" +
                "Display\tContrast ratio: infinite (nominal)\n" +
                "Camera\tPhoto / Video\n" +
                "Loudspeaker\tVoice 68dB / Noise 73dB / Ring 86dB\n" +
                "Audio quality\tNoise -94.0dB / Crosstalk -95.1dB\n" +
                "Battery life\t\n" +
                "Endurance rating 107h\n" +
                "Disclaimer. We can not guarantee that the information on this page is 100% correct.");
        image.add("https://fdn2.gsmarena.com/vv/bigpic/samsung-galaxy-note10-plus-.jpg");

        merk.add("Apple iPhone 11 Pro Max");
        spek.add("NETWORK\tTechnology\t\n" +
                "GSM / CDMA / HSPA / EVDO / LTE\n" +
                "LAUNCH\tAnnounced\t2019, September\n" +
                "Status\tAvailable. Released 2019, September\n" +
                "BODY\tDimensions\t158 x 77.8 x 8.1 mm (6.22 x 3.06 x 0.32 in)\n" +
                "Weight\t226 g (7.97 oz)\n" +
                "Build\tFront/back glass, stainless steel frame\n" +
                "SIM\tSingle SIM (Nano-SIM and/or Electronic SIM card) or Dual SIM (Nano-SIM, dual stand-by) - for China\n" +
                " \tIP68 dust/water resistant (up to 4m for 30 mins)\n" +
                "Apple Pay (Visa, MasterCard, AMEX certified)\n" +
                "DISPLAY\tType\tSuper Retina XDR OLED capacitive touchscreen, 16M colors\n" +
                "Size\t6.5 inches, 102.9 cm2 (~83.7% screen-to-body ratio)\n" +
                "Resolution\t1242 x 2688 pixels, 19.5:9 ratio (~458 ppi density)\n" +
                "Protection\tScratch-resistant glass, oleophobic coating\n" +
                " \t800 nits max brightness\n" +
                "Dolby Vision\n" +
                "HDR10\n" +
                "Wide color gamut\n" +
                "True-tone\n" +
                "120 Hz touch-sensing\n" +
                "PLATFORM\tOS\tiOS 13, upgradable to iOS 13.1.2\n" +
                "Chipset\tApple A13 Bionic (7 nm+)\n" +
                "CPU\tHexa-core (2x2.65 GHz Lightning + 4x1.8 GHz Thunder)\n" +
                "GPU\tApple GPU (4-core graphics)\n" +
                "MEMORY\tCard slot\tNo\n" +
                "Internal\t64GB 4GB RAM, 256GB 4GB RAM, 512GB 4GB RAM\n" +
                "MAIN CAMERA\tTriple\t12 MP, f/1.8, 26mm (wide), 1/2.55\", 1.4µm, dual pixel PDAF, OIS\n" +
                "12 MP, f/2.0, 52mm (telephoto), 1/3.4\", 1.0µm, PDAF, OIS, 2x optical zoom\n" +
                "12 MP, f/2.4, 13mm (ultrawide)\n" +
                "Features\tQuad-LED dual-tone flash, HDR (photo/panorama)\n" +
                "Video\t2160p@24/30/60fps, 1080p@30/60/120/240fps, HDR, stereo sound rec.\n" +
                "SELFIE CAMERA\tDual\t12 MP, f/2.2, 23mm (wide)\n" +
                "SL 3D camera\n" +
                "Features\tHDR\n" +
                "Video\t2160p@24/30/60fps, 1080p@30/60/120fps, gyro-EIS\n" +
                "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                "3.5mm jack\tNo\n" +
                " \tActive noise cancellation with dedicated mic\n" +
                "Dolby Atmos\n" +
                "Dolby Digital Plus\n" +
                "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac/ax, dual-band, hotspot\n" +
                "Bluetooth\t5.0, A2DP, LE\n" +
                "GPS\tYes, with A-GPS, GLONASS, GALILEO, QZSS\n" +
                "NFC\tYes\n" +
                "Radio\tNo\n" +
                "USB\t2.0, proprietary reversible connector\n" +
                "FEATURES\tSensors\tFace ID, accelerometer, gyro, proximity, compass, barometer\n" +
                " \tSiri natural language commands and dictation\n" +
                "BATTERY\t \tNon-removable Li-Ion 3969 mAh battery (15.04 Wh)\n" +
                "Charging\tFast battery charging 18W: 50% in 30 min\n" +
                "USB Power Delivery 2.0\n" +
                "Qi wireless charging\n" +
                "Talk time\tUp to 20 h (multimedia)\n" +
                "Music play\tUp to 80 h\n" +
                "MISC\tColors\tSpace Gray, Silver, Gold, Midnight Green (matte colors)\n" +
                "Models\tA2218, A2161, A2220\n" +
                "SAR\t1.16 W/kg (head)     1.17 W/kg (body)    \n" +
                "SAR EU\t0.95 W/kg (head)     0.99 W/kg (body)    \n" +
                "Price\t$ 1,079.00 / £ 1,149.00 / ₹ 109,900\n" +
                "TESTS\tPerformance\tBasemark OS II 2.0: 6353\n" +
                "Display\tContrast ratio: Infinite (nominal)\n" +
                "Camera\tPhoto / Video\n" +
                "Loudspeaker\tVoice 71dB / Noise 74dB / Ring 79dB\n" +
                "Audio quality\tNoise -94.3dB / Crosstalk -81.5dB\n" +
                "Battery life\t\n" +
                "Endurance rating 102h\n" +
                "Disclaimer. We can not guarantee that the information on this page is 100% correct");
        image.add("https://fdn2.gsmarena.com/vv/bigpic/apple-iphone-11-pro.jpg");

        merk.add("Huawei Mate 30 RS Porsche Design");
        spek.add("NETWORK\tTechnology\t\n" +
                "GSM / HSPA / LTE / 5G\n" +
                "LAUNCH\tAnnounced\t2019, September\n" +
                "Status\tAvailable. Released 2019, September\n" +
                "BODY\tDimensions\t158.1 x 73.1 x 9.3 mm (6.22 x 2.88 x 0.37 in)\n" +
                "Weight\t198 g (6.98 oz)\n" +
                "Build\tFront glass, leather/glass back, aluminum frame\n" +
                "SIM\tHybrid Dual SIM (Nano-SIM, dual stand-by)\n" +
                " \tIP68 dust/water resistant (up to 2m for 30 mins)\n" +
                "DISPLAY\tType\tOLED capacitive touchscreen, 16M colors\n" +
                "Size\t6.53 inches, 108.7 cm2 (~94.1% screen-to-body ratio)\n" +
                "Resolution\t1176 x 2400 pixels, 18.5:9 ratio (~409 ppi density)\n" +
                "Protection\tCorning Gorilla Glass 6\n" +
                " \tDCI-P3\n" +
                "HDR10\n" +
                "PLATFORM\tOS\tAndroid 10; EMUI 10\n" +
                "Chipset\tHiSilicon Kirin 990 (7 nm+)\n" +
                "CPU\tOcta-core (2x2.86 GHz Cortex-A76 & 2x2.36 GHz Cortex-A76 & 4x1.95 GHz Cortex-A55)\n" +
                "GPU\tMali-G76 MP16\n" +
                "MEMORY\tCard slot\tNM (Nano Memory), up to 256GB (uses shared SIM slot)\n" +
                "Internal\t512GB 12GB RAM\n" +
                " \tUFS3.0\n" +
                "MAIN CAMERA\tQuad\t40 MP, f/1.6, 27mm (wide), 1/1.7\", PDAF, OIS\n" +
                "8 MP, f/2.4, 80mm (telephoto), 1/4\", PDAF, OIS, 3x optical zoom\n" +
                "40 MP, f/1.8, 18mm (ultrawide), 1/1.54\", PDAF\n" +
                "3D TOF camera\n" +
                "Features\tLeica optics, dual-LED dual-tone flash, panorama, HDR\n" +
                "Video\t2160p@30/60fps, 1080p@30/60/120fps, 1080p@960fps, 720p@7680fps, gyro-EIS\n" +
                "SELFIE CAMERA\tDual\t32 MP, f/2.0 (wide)\n" +
                "3D TOF camera\n" +
                "Features\tHDR, panorama\n" +
                "Video\t1080p@30fps\n" +
                "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                "3.5mm jack\tNo\n" +
                " \t32-bit/384kHz audio\n" +
                "Active noise cancellation with dedicated mic\n" +
                "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac, dual-band, DLNA, Wi-Fi Direct, hotspot\n" +
                "Bluetooth\t5.1, A2DP, aptX HD, LE\n" +
                "GPS\tYes, with dual-band A-GPS, GLONASS, BDS, GALILEO, QZSS\n" +
                "NFC\tYes\n" +
                "Infrared port\tYes\n" +
                "Radio\tNo\n" +
                "USB\t3.1, Type-C 1.0 reversible connector, USB On-The-Go\n" +
                "FEATURES\tSensors\tFace ID, fingerprint (under display, optical), accelerometer, gyro, proximity, barometer, compass\n" +
                "BATTERY\t \tNon-removable Li-Po 4500 mAh battery\n" +
                "Charging\tFast battery charging 40W\n" +
                "Fast wireless charging 27W\n" +
                "Power bank/Reverse wireless charging\n" +
                "MISC\tColors\tBlack, Red\n" +
                "Models\tLIO-N29, LIO-AN00P\n" +
                "Price\tAbout 1700 EUR\n" +
                "Disclaimer. We can not guarantee that the information on this page is 100% correct");
        image.add("https://fdn2.gsmarena.com/vv/bigpic/huawei-mate-30-rs-porsche-design.jpg");

        merk.add("Nokia 9 PureView");
        spek.add("NETWORK\tTechnology\t\n" +
                "GSM / HSPA / LTE\n" +
                "LAUNCH\tAnnounced\t2019, February\n" +
                "Status\tAvailable. Released 2019, February\n" +
                "BODY\tDimensions\t155 x 75 x 8 mm (6.10 x 2.95 x 0.31 in)\n" +
                "Weight\t172 g (6.07 oz)\n" +
                "Build\tFront/back glass, aluminum frame\n" +
                "SIM\tSingle SIM (Nano-SIM) or Hybrid Dual SIM (Nano-SIM, dual stand-by)\n" +
                " \tIP67 dust/water resistant (up to 1m for 30 mins)\n" +
                "DISPLAY\tType\tP-OLED capacitive touchscreen, 16M colors\n" +
                "Size\t5.99 inches, 92.6 cm2 (~79.7% screen-to-body ratio)\n" +
                "Resolution\t1440 x 2880 pixels, 18:9 ratio (~538 ppi density)\n" +
                "Protection\tCorning Gorilla Glass 5\n" +
                " \tAlways-on display\n" +
                "HDR10\n" +
                "PLATFORM\tOS\tAndroid 9.0 (Pie); Android One\n" +
                "Chipset\tQualcomm SDM845 Snapdragon 845 (10 nm)\n" +
                "CPU\tOcta-core (4x2.8 GHz Kryo 385 Gold & 4x1.7 GHz Kryo 385 Silver)\n" +
                "GPU\tAdreno 630\n" +
                "MEMORY\tCard slot\tNo\n" +
                "Internal\t128GB 6GB RAM\n" +
                "MAIN CAMERA\tFive\t5x 12 MP, f/1.8, 28mm (wide), 1/2.9\", 1.25µm\n" +
                "(2x RGB & 3x B/W cameras, working simultaneously)\n" +
                "TOF 3D camera\n" +
                "Features\tZeiss optics, dual-LED dual-tone flash, HDR, panorama\n" +
                "Video\t2160p@30fps, 1080p@30fps, HDR\n" +
                "SELFIE CAMERA\tSingle\t20 MP, 1.0µm\n" +
                "Features\tHDR\n" +
                "Video\t2160p@30fps, 1080p@30fps, HDR\n" +
                "SOUND\tLoudspeaker\tYes\n" +
                "3.5mm jack\tNo\n" +
                " \t24-bit/192kHz audio\n" +
                "Active noise cancellation with dedicated mic\n" +
                "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, hotspot\n" +
                "Bluetooth\t5.0, A2DP, LE, aptX\n" +
                "GPS\tYes, with A-GPS, GLONASS, BDS\n" +
                "NFC\tYes\n" +
                "Radio\tNo\n" +
                "USB\t3.1, Type-C 1.0 reversible connector\n" +
                "FEATURES\tSensors\tFingerprint (under display, optical), accelerometer, gyro, proximity, compass, barometer\n" +
                " \tANT+\n" +
                "BATTERY\t \tNon-removable Li-Po 3320 mAh battery\n" +
                "Charging\tFast battery charging 18W (Quick Charge 3.0)\n" +
                "USB Power Delivery\n" +
                "Fast wireless charging 10W (Qi); 5W (PMA)\n" +
                "MISC\tColors\tMidnight Blue\n" +
                "Models\tTA-1094, A-1087, TA-1082\n" +
                "Price\tAbout 530 EUR\n" +
                "TESTS\tPerformance\tBasemark OS II: 4758 / Basemark OS II 2.0: 4286\n" +
                "Basemark X: 43718\n" +
                "Display\tContrast ratio: Infinite (nominal), 5.981 (sunlight)\n" +
                "Camera\tPhoto / Video\n" +
                "Loudspeaker\tVoice 68dB / Noise 71dB / Ring 81dB\n" +
                "Audio quality\tNoise -94.0dB / Crosstalk -93.2dB\n" +
                "Battery life\t\n" +
                "Endurance rating 79h\n" +
                "Disclaimer. We can not guarantee that the information on this page is 100% correct.");
        image.add("https://fdn2.gsmarena.com/vv/bigpic/nokia-9-pureview-.jpg");

        merk.add("Sony Xperia 5");
        spek.add("NETWORK\tTechnology\t\n" +
                "GSM / HSPA / LTE\n" +
                "LAUNCH\tAnnounced\t2019, September\n" +
                "Status\tComing soon. Exp. release 2019, October\n" +
                "BODY\tDimensions\t158 x 68 x 8.2 mm (6.22 x 2.68 x 0.32 in)\n" +
                "Weight\t164 g (5.78 oz)\n" +
                "Build\tFront/back glass (Gorilla Glass 6) & aluminum frame\n" +
                "SIM\tSingle SIM (Nano-SIM) or Hybrid Dual SIM (Nano-SIM, dual stand-by)\n" +
                " \tIP65/IP68 dust/water resistant (up to 1.5m for 30 mins)\n" +
                "DISPLAY\tType\tOLED capacitive touchscreen, 16M colors\n" +
                "Size\t6.1 inches, 86.9 cm2 (~80.9% screen-to-body ratio)\n" +
                "Resolution\t1080 x 2520 pixels, 21:9 ratio (~449 ppi density)\n" +
                "Protection\tCorning Gorilla Glass 6\n" +
                " \tDCI-P3 100%\n" +
                "HDR BT.2020\n" +
                "Triluminos display\n" +
                "X-Reality Engine\n" +
                "PLATFORM\tOS\tAndroid 9.0 (Pie)\n" +
                "Chipset\tQualcomm SDM855 Snapdragon 855 (7 nm)\n" +
                "CPU\tOcta-core (1x2.84 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.78 GHz Kryo 485)\n" +
                "GPU\tAdreno 640\n" +
                "MEMORY\tCard slot\tmicroSD, up to 1 TB (uses shared SIM slot) - dual SIM model only\n" +
                "Internal\t128GB 6GB RAM\n" +
                "MAIN CAMERA\tTriple\t12 MP, f/1.6, 26mm (wide), 1/2.6\", 1.4µm, predictive Dual Pixel PDAF, 5-axis OIS\n" +
                "12 MP, f/2.4, 52mm (telephoto), 1/3.4\", 1.0µm, predictive PDAF, 2x optical zoom, 5-axis OIS\n" +
                "12 MP, f/2.4, 16mm (ultrawide), 1/3.4\", 1.0µm\n" +
                "Features\tLED flash, panorama, HDR, eye tracking\n" +
                "Video\t2160p@24/30fps HDR, 1080p@60fps, 1080p@30fps (5-axis gyro-EIS)\n" +
                "SELFIE CAMERA\tSingle\t8 MP, f/2.0, 24mm (wide), 1/4\", 1.12µm\n" +
                "Features\tHDR\n" +
                "Video\t1080p@30fps (5-axis gyro-EIS)\n" +
                "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                "3.5mm jack\tNo\n" +
                " \t24-bit/192kHz audio\n" +
                "Dynamic vibration system\n" +
                "Active noise cancellation with dedicated mic\n" +
                "Dolby Atmos sound\n" +
                "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, DLNA, hotspot\n" +
                "Bluetooth\t5.0, A2DP, aptX HD, LE\n" +
                "GPS\tYes, with A-GPS, GLONASS, BDS, GALILEO\n" +
                "NFC\tYes\n" +
                "Radio\tNo\n" +
                "USB\t3.1, Type-C 1.0 reversible connector; USB On-The-Go\n" +
                "FEATURES\tSensors\tFingerprint (side-mounted), accelerometer, gyro, proximity, barometer, compass, color spectrum\n" +
                "BATTERY\t \tNon-removable Li-Ion 3140 mAh battery\n" +
                "Charging\tFast battery charging 18W (USB Power Delivery 2.0)\n" +
                "USB Power Delivery\n" +
                "MISC\tColors\tBlue, Red, Black, Grey\n" +
                "Models\tJ8210, J8270, J9210\n" +
                "Price\tAbout 800 EUR\n" +
                "TESTS\tPerformance\tBasemark OS II: 5257 / Basemark OS II 2.0: 5097\n" +
                "Basemark X: 45092\n" +
                "Display\tContrast ratio: Infinite (nominal)\n" +
                "Loudspeaker\tVoice 68dB / Noise 73dB / Ring 79dB\n" +
                "Audio quality\tNoise -93.0dB / Crosstalk -89.4dB\n" +
                "Battery life\t\n" +
                "Endurance rating 96h\n" +
                "Disclaimer. We can not guarantee that the information on this page is 100% correct.");
        image.add("https://fdn2.gsmarena.com/vv/bigpic/sony-xperia-5-.jpg");

        merk.add("LG V50 ThinQ");
        spek.add("NETWORK\tTechnology\t\n" +
                "GSM / CDMA / HSPA / EVDO / LTE / 5G\n" +
                "LAUNCH\tAnnounced\t2019, February\n" +
                "Status\tAvailable. Released 2019, May\n" +
                "BODY\tDimensions\t159.2 x 76.1 x 8.3 mm (6.27 x 3.00 x 0.33 in)\n" +
                "Weight\t183 g (6.46 oz)\n" +
                "Build\tFront glass (Gorilla Glass 5), back glass (Gorilla Glass 6), aluminum frame\n" +
                "SIM\tSingle SIM (Nano-SIM) or Dual SIM (Nano-SIM, dual stand-by)\n" +
                " \tIP68 dust/water resistant (up to 1.5m for 30 mins)\n" +
                "MIL-STD-810G compliant\n" +
                "DISPLAY\tType\tP-OLED capacitive touchscreen, 16M colors\n" +
                "Size\t6.4 inches, 100.2 cm2 (~82.7% screen-to-body ratio)\n" +
                "Resolution\t1440 x 3120 pixels, 19.5:9 ratio (~538 ppi density)\n" +
                "Protection\tCorning Gorilla Glass 5\n" +
                " \tDolby Vision\n" +
                "HDR10\n" +
                "Always-on display\n" +
                "PLATFORM\tOS\tAndroid 9.0 (Pie); LG UX 8.0\n" +
                "Chipset\tQualcomm SDM855 Snapdragon 855 (7 nm)\n" +
                "CPU\tOcta-core (1x2.84 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.78 GHz Kryo 485)\n" +
                "GPU\tAdreno 640\n" +
                "MEMORY\tCard slot\tmicroSD, up to 1 TB (dedicated slot)\n" +
                "Internal\t128GB 6GB RAM\n" +
                "MAIN CAMERA\tTriple\t12 MP, 27mm (standard), f/1.5, 1/2.6\", 1.4µm, dual pixel PDAF, 3-axis OIS\n" +
                "12 MP, 52mm (telephoto), f/2.4, 1/3.4\", 1.0µm, 2x optical zoom, PDAF, OIS\n" +
                "16 MP, 16mm (ultrawide), f/1.9, 1/3.1\", 1.0µm, no AF\n" +
                "Features\tLED flash, HDR, panorama\n" +
                "Video\t2160p@30/60fps, 1080p@30/60/240fps, 24-bit/192kHz stereo sound rec., HDR10 video, gyro-EIS\n" +
                "SELFIE CAMERA\tDual\t8 MP, 26mm (standard), f/1.9, 1/4\", 1.12µm\n" +
                "5 MP, 21mm (wide), f/2.2, 1/5\", 1.12µm\n" +
                "Features\tHDR\n" +
                "Video\t1080p@60fps\n" +
                "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                "3.5mm jack\tYes\n" +
                " \t32-bit/192kHz audio\n" +
                "24-bit/192kHz audio recording\n" +
                "Active noise cancellation with dedicated mic\n" +
                "DTS: X Surround Sound\n" +
                "Tuned with Meridian Audio\n" +
                "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, DLNA, hotspot\n" +
                "Bluetooth\t5.0, A2DP, LE, aptX HD\n" +
                "GPS\tYes, with A-GPS, GLONASS, GALILEO\n" +
                "NFC\tYes\n" +
                "Radio\tNo\n" +
                "USB\t3.1, Type-C 1.0 reversible connector\n" +
                "FEATURES\tSensors\tFingerprint (rear-mounted), accelerometer, gyro, proximity, compass, barometer\n" +
                "BATTERY\t \tNon-removable Li-Po 4000 mAh battery\n" +
                "Charging\tFast battery charging 18W: 50% in 36 min (Quick Charge 3.0)\n" +
                "USB Power Delivery 2.0\n" +
                "Qi fast wireless charging 10W\n" +
                "MISC\tColors\tNew Aurora Black\n" +
                "Models\tLM-V500, LM-V500N, LM-V500EM, LM-V500XM, LM-V450PM\n" +
                "Price\tAbout 950 EUR\n" +
                "Disclaimer. We can not guarantee that the information on this page is 100% correct.");
        image.add("https://fdn2.gsmarena.com/vv/bigpic/lg-gv50-thinq-.jpg");

        merk.add("HTC Exodus 1");
        spek.add("NETWORK\tTechnology\t\n" +
                "GSM / HSPA / LTE\n" +
                "LAUNCH\tAnnounced\t2018, October\n" +
                "Status\tAvailable. Released 2018, December\n" +
                "BODY\tDimensions\t156.6 x 73.9 x 8.7 mm (6.17 x 2.91 x 0.34 in)\n" +
                "Weight\t188 g (6.63 oz)\n" +
                "SIM\tDual SIM (Nano-SIM, dual stand-by)\n" +
                " \tIP68 dust/water resistant (up to 1.5m for 30 mins)\n" +
                "DISPLAY\tType\tSuper LCD6 capacitive touchscreen, 16M colors\n" +
                "Size\t6.0 inches, 92.9 cm2 (~80.3% screen-to-body ratio)\n" +
                "Resolution\t1440 x 2880 pixels, 18:9 ratio (~537 ppi density)\n" +
                "PLATFORM\tOS\tAndroid 8.1 (Oreo)\n" +
                "Chipset\tQualcomm SDM845 Snapdragon 845 (10 nm)\n" +
                "CPU\tOcta-core (4x2.8 GHz Kryo 385 Gold & 4x1.7 GHz Kryo 385 Silver)\n" +
                "GPU\tAdreno 630\n" +
                "MEMORY\tCard slot\tNo\n" +
                "Internal\t128GB 6GB RAM\n" +
                "MAIN CAMERA\tDual\t12 MP, f/1.8, 1/2.55\", 1.4µm, dual pixel PDAF, Laser AF, OIS\n" +
                "16 MP (12 MP effective), f/2.6, 1.0µm, 2x optical zoom, AF\n" +
                "Features\tDual-LED dual-tone flash, HDR\n" +
                "Video\t2160p@60fps, 1080p@60/240fps, 1080p@30fps (gyro-EIS), HDR, 24-bit/96kHz stereo sound rec.\n" +
                "SELFIE CAMERA\tDual\t8 MP, f/2.0, 1/4\", 1.12µm\n" +
                "8 MP, f/2.0, 1/4\", 1.12µm\n" +
                "Features\tHDR, panorama\n" +
                "Video\t1080p@30fps\n" +
                "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                "3.5mm jack\tNo\n" +
                " \t32-bit/384kHz audio\n" +
                "Active noise cancellation with dedicated mic\n" +
                "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, hotspot\n" +
                "Bluetooth\t5.0, A2DP, aptX HD, LE\n" +
                "GPS\tYes, with A-GPS, GLONASS, GALILEO, BDS\n" +
                "Radio\tNo\n" +
                "USB\t3.1, Type-C 1.0 reversible connector\n" +
                "FEATURES\tSensors\tFingerprint (rear-mounted), accelerometer, gyro, proximity, compass\n" +
                " \tZion crypto wallet\n" +
                "Secure Enclave\n" +
                "Social Key Recovery (key sharding)\n" +
                "dApps (decentralized apps)\n" +
                "BATTERY\t \tNon-removable Li-Ion 3500 mAh battery\n" +
                "Charging\tFast battery charging 18W: 50% in 35 min (Quick Charge 3.0)\n" +
                "MISC\tColors\tBlack\n" +
                "Price\tAbout BTC 0.15/ETH 4.78(crypto curr)\n" +
                "Disclaimer. We can not guarantee that the information on this page is 100% correct.");
        image.add("https://fdn2.gsmarena.com/vv/bigpic/htc-exodus-.jpg");

        merk.add("Xiaomi Mi Mix Alpha");
        spek.add("NETWORK\tTechnology\t\n" +
                "GSM / CDMA / HSPA / LTE / 5G\n" +
                "LAUNCH\tAnnounced\t2019, September\n" +
                "Status\tComing soon. Exp. release 2019, December\n" +
                "BODY\tDimensions\t154.4 x 72.3 x 10.4 mm (6.08 x 2.85 x 0.41 in)\n" +
                "Weight\t241 g (8.50 oz)\n" +
                "Build\tTitanium alloy frame (TC4), ceramic back strip\n" +
                "SIM\tDual SIM (Nano-SIM, dual stand-by)\n" +
                "DISPLAY\tType\tFlexible Super AMOLED capacitive touchscreen, 16M colors\n" +
                "Size\t7.92 inches, 201.8 cm2 (~180.8% screen-to-body ratio)\n" +
                "Resolution\t2088 x 2250 pixels (~388 ppi density)\n" +
                "PLATFORM\tOS\tAndroid 10; MIUI 11\n" +
                "Chipset\tQualcomm SDM855 Snapdragon 855+ (7 nm)\n" +
                "CPU\tOcta-core (1x2.96 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.8 GHz Kryo 485)\n" +
                "GPU\tAdreno 640 (700 MHz)\n" +
                "MEMORY\tCard slot\tNo\n" +
                "Internal\t512GB 12GB RAM\n" +
                " \tUFS3.0\n" +
                "MAIN CAMERA\tTriple\t108 MP, f/1.7, (wide), 1/1.33\", 0.8µm, PDAF, Laser AF\n" +
                "12 MP, f/2.0, 54mm (telephoto), 1/2.55\", 1.4µm, Dual Pixel PDAF, Laser AF, 2x optical zoom\n" +
                "20 MP, f/2.2, 13mm (ultrawide), 1/2.8\", 1.0µm, Laser AF\n" +
                "Features\tDual-LED flash, HDR, panorama\n" +
                "Video\t3240p@30fps, 2160p@30/60fps, 1080p@30/120/240fps, 1080p@960fps\n" +
                "SELFIE CAMERA\tTriple\tNo - uses main camera\n" +
                "Features\tDual-LED flash, HDR, panorama\n" +
                "Video\t3240p@30fps, 2160p@30/60fps, 1080p@30/120/240fps, 1080p@960fps\n" +
                "SOUND\tLoudspeaker\tYes\n" +
                "3.5mm jack\tNo\n" +
                " \tActive noise cancellation with dedicated mic\n" +
                "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, DLNA, hotspot\n" +
                "Bluetooth\t5.0, A2DP, LE, aptX HD\n" +
                "GPS\tYes, with dual-band A-GPS, GLONASS, BDS, GALILEO, QZSS\n" +
                "Radio\tNo\n" +
                "USB\tType-C 1.0 reversible connector\n" +
                "FEATURES\tSensors\tFingerprint (under display, optical), accelerometer, gyro, proximity, compass, barometer\n" +
                "BATTERY\t \tNon-removable Li-Po 4050 mAh battery\n" +
                "Charging\tFast battery charging 40W\n" +
                "MISC\tColors\tBlack\n" +
                "Price\tAbout 2500 EUR\n" +
                "Disclaimer. We can not guarantee that the information on this page is 100% correct.");
        image.add("https://fdn2.gsmarena.com/vv/bigpic/xiaomi-mi-mix-alpha.jpg");

        merk.add("Google Pixel 3 XL");
        spek.add("NETWORK\tTechnology\t\n" +
                "GSM / CDMA / HSPA / EVDO / LTE\n" +
                "LAUNCH\tAnnounced\t2018, October\n" +
                "Status\tAvailable. Released 2018, November\n" +
                "BODY\tDimensions\t158 x 76.7 x 7.9 mm (6.22 x 3.02 x 0.31 in)\n" +
                "Weight\t184 g (6.49 oz)\n" +
                "Build\tFront/back glass (Gorilla Glass 5), aluminum frame\n" +
                "SIM\tNano-SIM card & eSIM\n" +
                " \tIP68 dust/water resistant (up to 1.5m for 30 mins)\n" +
                "DISPLAY\tType\tP-OLED capacitive touchscreen, 16M colors\n" +
                "Size\t6.3 inches, 100.3 cm2 (~82.8% screen-to-body ratio)\n" +
                "Resolution\t1440 x 2960 pixels, 18.5:9 ratio (~523 ppi density)\n" +
                "Protection\tCorning Gorilla Glass 5\n" +
                " \tDCI-P3 100%\n" +
                "HDR\n" +
                "Always-on display\n" +
                "PLATFORM\tOS\tAndroid 9.0 (Pie), upgradable to Android 10\n" +
                "Chipset\tQualcomm SDM845 Snapdragon 845 (10 nm)\n" +
                "CPU\tOcta-core (4x2.5 GHz Kryo 385 Gold & 4x1.6 GHz Kryo 385 Silver)\n" +
                "GPU\tAdreno 630\n" +
                "MEMORY\tCard slot\tNo\n" +
                "Internal\t64GB 4GB RAM, 128GB 4GB RAM\n" +
                "MAIN CAMERA\tSingle\t12.2 MP, f/1.8, 28mm (wide), 1/2.55\", 1.4µm, dual pixel PDAF, OIS\n" +
                "Features\tDual-LED flash, Auto-HDR, panorama\n" +
                "Video\t2160p@30fps, 1080p@30/60/120fps, 720p@240fps, 1080p@30fps (gyro-EIS)\n" +
                "SELFIE CAMERA\tDual\t8 MP, f/1.8, 28mm (wide), PDAF\n" +
                "8 MP, f/2.2, 19mm (ultrawide), no AF\n" +
                "Features\tAuto-HDR\n" +
                "Video\t1080p@30fps\n" +
                "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                "3.5mm jack\tNo\n" +
                " \tActive noise cancellation with dedicated mic\n" +
                "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, DLNA, hotspot\n" +
                "Bluetooth\t5.0, A2DP, LE, aptX HD\n" +
                "GPS\tYes, with A-GPS, GLONASS, BDS, GALILEO\n" +
                "NFC\tYes\n" +
                "Radio\tNo\n" +
                "USB\t3.1, Type-C 1.0 reversible connector\n" +
                "FEATURES\tSensors\tFingerprint (rear-mounted), accelerometer, gyro, proximity, compass, barometer\n" +
                "BATTERY\t \tNon-removable Li-Po 3430 mAh battery\n" +
                "Charging\tFast battery charging 18W\n" +
                "USB Power Delivery 2.0\n" +
                "QI wireless charging\n" +
                "MISC\tColors\tClearly White, Just Black, Not Pink\n" +
                "Models\tPixel 3 XL\n" +
                "Price\tAbout 960 EUR\n" +
                "Disclaimer. We can not guarantee that the information on this page is 100% correct.");
        image.add("https://fdn2.gsmarena.com/vv/bigpic/google-pixel-3xl-.jpg");

        merk.add("OnePlus 7 Pro");
        spek.add("NETWORK\tTechnology\t\n" +
                "GSM / CDMA / HSPA / LTE\n" +
                "LAUNCH\tAnnounced\t2019, May\n" +
                "Status\tAvailable. Released 2019, May\n" +
                "BODY\tDimensions\t162.6 x 75.9 x 8.8 mm (6.40 x 2.99 x 0.35 in)\n" +
                "Weight\t206 g (7.27 oz)\n" +
                "Build\tFront/back glass (Gorilla Glass 5), aluminum frame\n" +
                "SIM\tDual SIM (Nano-SIM, dual stand-by)\n" +
                "DISPLAY\tType\tFluid AMOLED capacitive touchscreen, 16M colors\n" +
                "Size\t6.67 inches, 108.8 cm2 (~88.1% screen-to-body ratio)\n" +
                "Resolution\t1440 x 3120 pixels, 19.5:9 ratio (~516 ppi density)\n" +
                "Protection\tCorning Gorilla Glass 5\n" +
                " \tDCI-P3\n" +
                "HDR10+\n" +
                "90Hz\n" +
                "PLATFORM\tOS\tAndroid 9.0 (Pie); OxygenOS 9.5.11\n" +
                "Chipset\tQualcomm SDM855 Snapdragon 855 (7 nm)\n" +
                "CPU\tOcta-core (1x2.84 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.78 GHz Kryo 485)\n" +
                "GPU\tAdreno 640\n" +
                "MEMORY\tCard slot\tNo\n" +
                "Internal\t128GB 6GB RAM, 256GB 8GB RAM, 256GB 12GB RAM\n" +
                "MAIN CAMERA\tTriple\t48 MP, f/1.6, (wide), 1/2\", 0.8µm, PDAF, Laser AF, OIS\n" +
                "8 MP, f/2.4, 78mm (telephoto), 3x zoom, PDAF, Laser AF, OIS\n" +
                "16 MP, f/2.2, 13mm (ultrawide), AF\n" +
                "Features\tDual-LED dual-tone flash, panorama, HDR\n" +
                "Video\t2160p@30/60fps, 1080p@30/60/240fps, 720p@480fps, Auto HDR, gyro-EIS, no video rec. with ultrawide camera\n" +
                "SELFIE CAMERA\tSingle\tMotorized pop-up 16 MP, f/2.0, 25mm (wide), 1/3.0\", 1.0µm\n" +
                "Features\tAuto-HDR\n" +
                "Video\t1080p@30fps, gyro-EIS\n" +
                "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                "3.5mm jack\tNo\n" +
                " \tActive noise cancellation with dedicated mic\n" +
                "Dolby Atmos sound\n" +
                "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, DLNA, hotspot\n" +
                "Bluetooth\t5.0, A2DP, LE, aptX HD\n" +
                "GPS\tYes, with dual-band A-GPS, GLONASS, BDS, GALILEO, SBAS\n" +
                "NFC\tYes\n" +
                "Radio\tNo\n" +
                "USB\t3.1, Type-C 1.0 reversible connector, USB On-The-Go\n" +
                "FEATURES\tSensors\tFingerprint (under display, optical), accelerometer, gyro, proximity, compass\n" +
                "BATTERY\t \tNon-removable Li-Po 4000 mAh battery\n" +
                "Charging\tFast battery charging 30W (Warp Charge)\n" +
                "MISC\tColors\tMirror Grey, Almond, Nebula Blue\n" +
                "Models\tGM1911, GM1913, GM1917, GM1910, GM1915\n" +
                "Price\t$ 588.41 / £ 549.00 / ₹ 44,999\n" +
                "TESTS\tPerformance\tBasemark OS II: 5348 / Basemark OS II 2.0: 4797\n" +
                "Basemark X: 45413\n" +
                "Camera\tPhoto / Video\n" +
                "Loudspeaker\tVoice 79dB / Noise 77dB / Ring 80dB\n" +
                "Audio quality\tNoise -93.0dB / Crosstalk -89.6dB\n" +
                "Battery life\t\n" +
                "Endurance rating 85h\n" +
                "Disclaimer. We can not guarantee that the information on this page is 100% correct.");
        image.add("https://fdn2.gsmarena.com/vv/bigpic/oneplus-7-pro-r1.jpg");

        selectPhone();
    }



    private void selectPhone() {
        RecyclerView recyclerView = findViewById(R.id.category);
        ListPhoneAdapter listPhoneAdapter = new ListPhoneAdapter(this, merk, spek, image);
        recyclerView.setAdapter(listPhoneAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
