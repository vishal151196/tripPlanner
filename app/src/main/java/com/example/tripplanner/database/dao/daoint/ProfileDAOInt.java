package com.example.tripplanner.database.dao.daoint;

import com.example.tripplanner.database.dto.ProfileDTO;




public interface ProfileDAOInt {
    ProfileDTO getProfile(int id);

    boolean insertProfile(ProfileDTO profileDTO);

    boolean updateProfile(ProfileDTO profileDTO);

    boolean deleteProfile(int id);

    boolean isEmailExist(String profile_email);

    int NumberOfUser();

    ProfileDTO getProfileByEmailAndPassword(String profile_email, String profile_password);

    ProfileDTO getProfileByEmail(String profile_email);

}
