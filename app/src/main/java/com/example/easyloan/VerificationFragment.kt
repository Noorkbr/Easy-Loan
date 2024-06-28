package com.example.easyloan

import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.easyloan.databinding.FragmentVerificationBinding
import com.example.fitglow.base.BaseFragment
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class VerificationFragment : BaseFragment<FragmentVerificationBinding>(FragmentVerificationBinding::inflate) {

    /*  private lateinit var uploadButton: Button
    private val imageUris = mutableListOf<Uri>()
    private lateinit var storageReference: StorageReference
    private lateinit var databaseReference: DatabaseReference


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Use view binding to inflate the layout
        val binding = FragmentVerificationBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        uploadButton = view.findViewById(R.id.upload_button)

        // Initialize Firebase Storage and Database references
        storageReference = FirebaseStorage.getInstance().reference
        databaseReference = FirebaseDatabase.getInstance().reference

        if (ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.READ_EXTERN
                     AL_STORAGE)
            != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(requireActivity(), arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), 1)
        }

        setListener()
    }

    override fun setListener() {
        uploadButton.setOnClickListener {
            if (ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.READ_EXTERNAL_STORAGE)
                == PackageManager.PERMISSION_GRANTED) {
                loadImages()
                uploadImagesToFirebase()
            } else {
                ActivityCompat.requestPermissions(requireActivity(), arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), 1)
            }
        }
    }

    override fun allObserver() {
        // Implement this method if you need to observe LiveData or other observable objects
    }

    private fun loadImages() {
        imageUris.clear()
        val uri: Uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        val projection = arrayOf(MediaStore.Images.Media._ID)
        val cursor: Cursor? = requireContext().contentResolver.query(
            uri,
            projection,
            null,
            null,
            "${MediaStore.Images.Media.DATE_ADDED} DESC"
        )

        cursor?.use {
            val idColumn = it.getColumnIndexOrThrow(MediaStore.Images.Media._ID)
            while (it.moveToNext()) {
                val id = it.getLong(idColumn)
                val imageUri = Uri.withAppendedPath(uri, id.toString())
                imageUris.add(imageUri)
            }
        }
    }

    private fun uploadImagesToFirebase() {
        for (imageUri in imageUris) {
            val fileName = "images/${System.currentTimeMillis()}.jpg"
            val imageRef = storageReference.child(fileName)

            imageRef.putFile(imageUri)
                .addOnSuccessListener {
                    imageRef.downloadUrl.addOnSuccessListener { uri ->
                        val imageUrl = uri.toString()
                        val key = databaseReference.child("images").push().key
                        key?.let {
                            databaseReference.child("images").child(it).setValue(imageUrl)
                        }
                    }
                    Toast.makeText(context, "Uploaded $fileName", Toast.LENGTH_SHORT).show()
                }
                .addOnFailureListener { exception ->
                    Toast.makeText(context, "Failed to upload $fileName: ${exception.message}", Toast.LENGTH_SHORT).show()
                }
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1) {
            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                // Permission granted, proceed with loading and uploading images
                loadImages()
                uploadImagesToFirebase()
            } else {
                // Permission denied, show a message to the user
                Toast.makeText(context, "Permission denied to read external storage", Toast.LENGTH_SHORT).show()
            }
        }*/
    override fun setListener() {

    }

    override fun allObserver() {

    }
}
