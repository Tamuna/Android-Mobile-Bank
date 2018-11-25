package ge.bog.mbank.ui.main.profile;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ge.bog.mbank.R;
import ge.bog.mbank.ui.main.dataaccess.DataAccessSession;
import ge.bog.mbank.model.clientinfo.ClientAddress;
import ge.bog.mbank.model.clientinfo.ClientInfo;
import ge.bog.mbank.ui.util.Helper;

public class ProfileFragment extends Fragment {

    private static final String MALE = "M";
    private static final String FEMALE = "F";
    private DataAccessSession dataAccessSession;

    private TextView tvName;
    private TextView tvLastName;
    private TextView tvSex;
    private TextView tvBirthday;
    private TextView tvClientCategory;
    private TextView tvPhone;
    private TextView tvAddress;
    private TextView tvEmail;

    public static ProfileFragment newInstance(int index) {
        return new ProfileFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        dataAccessSession = new DataAccessSession();

        tvName = view.findViewById(R.id.profile_tv_name);
        tvLastName = view.findViewById(R.id.profile_tv_lastname);
        tvSex = view.findViewById(R.id.profile_tv_sex);
        tvBirthday = view.findViewById(R.id.profile_tv_birthdate);
        tvClientCategory = view.findViewById(R.id.profile_tv_category);
        tvPhone = view.findViewById(R.id.profile_tv_phone);
        tvAddress = view.findViewById(R.id.profile_tv_address);
        tvEmail = view.findViewById(R.id.profile_tv_email);
        dataAccessSession.getClient(this);
        return view;
    }


    public void setData(ClientInfo clientInfo) {
        tvName.setText(clientInfo.getClient().getFirstName());
        tvLastName.setText(clientInfo.getClient().getLastName());
        tvSex.setText(getGenderName(clientInfo.getClient().getSex()));
        tvBirthday.setText(Helper.convertToDate(clientInfo.getClient().getBirthdate(), '.'));
        tvClientCategory.setText(clientInfo.getClient().getClientCategory());

        tvPhone.setText(clientInfo.getClientPhones().get(0).getMobile());
        tvAddress.setText(consturctAddress(clientInfo.getClientAdresses().get(0)));
        tvEmail.setText(clientInfo.getClientMails().get(0).getMail());
    }

    private String getGenderName(String sex) {
        if (sex.equals(MALE))
            return getContext().getResources().getString(R.string.male);
        if (sex.equals(FEMALE))
            return getContext().getResources().getString(R.string.female);
        return "";
    }

    private String consturctAddress(ClientAddress clientAddress) {
        return clientAddress.getStreet() + ", "
                + clientAddress.getBuilding()
                + ", " + clientAddress.getAppartment();
    }

}
