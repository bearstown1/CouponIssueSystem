package com.example.coumap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Geocoder geocoder;
    private Button button;
    private EditText editText;
    private ImageButton menubtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        editText = (EditText) findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        menubtn = (ImageButton)findViewById(R.id.menubtn);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);

        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu p = new PopupMenu(getApplicationContext(), v);

                getMenuInflater().inflate(R.menu.menu_main, p.getMenu());

                p.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        return false;
                    }
                });
                p.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void pop(View v){
        Toast.makeText(getApplicationContext(), "dd", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == 1) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }





    @Override
    public void onMapReady(final GoogleMap googleMap) {
        mMap = googleMap;
        geocoder = new Geocoder(this);


        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng point) {
                MarkerOptions mOptions = new MarkerOptions();
                // 마커 타이틀
                mOptions.title("마커 좌표");
                Double latitude = point.latitude; // 위도
                Double longitude = point.longitude; // 경도
                // 마커의 스니펫(간단한 텍스트) 설정
                mOptions.snippet(latitude.toString() + ", " + longitude.toString());
                // LatLng: 위도 경도 쌍을 나타냄
                mOptions.position(new LatLng(latitude, longitude));
                // 마커(핀) 추가
            }

        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=editText.getText().toString();
                List<Address> addressList = null;
                try {
                    // editText에 입력한 텍스트(주소, 지역, 장소 등)을 지오 코딩을 이용해 변환
                    addressList = geocoder.getFromLocationName(
                            str, // 주소
                            10); // 최대 검색 결과 개수
                }
                catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println(addressList.get(0).toString());
                // 콤마를 기준으로 split
                String []splitStr = addressList.get(0).toString().split(",");
                String address = splitStr[0].substring(splitStr[0].indexOf("\"") + 1,splitStr[0].length() - 2); // 주소
                System.out.println(address);
                String latitude = splitStr[10].substring(splitStr[10].indexOf("=") + 1); // 위도
                String longitude = splitStr[12].substring(splitStr[12].indexOf("=") + 1); // 경도
                System.out.println(latitude);
                System.out.println(longitude);

                // 좌표(위도, 경도) 생성
                LatLng point = new LatLng(Double.parseDouble(latitude), Double.parseDouble(longitude));
                // 마커 생성
                MarkerOptions mOptions2 = new MarkerOptions();
                mOptions2.title("search result");
                mOptions2.snippet(address);
                mOptions2.position(point);
                // 마커 추가
                mMap.addMarker(mOptions2);
                // 해당 좌표로 화면 줌
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(point,15));
            }
        });

        LatLng smu = new LatLng(36.798444, 127.073167);
        mMap.addMarker(new MarkerOptions().position(smu).title("선문대학교"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smu));

        LatLng b = new LatLng(36.898444, 127.073167);
        mMap.addMarker(new MarkerOptions().position(b).title("스타벅스"));

        LatLng c = new LatLng(36.858444, 127.173167);
        mMap.addMarker(new MarkerOptions().position(c).title("이디야"));
    }
}
