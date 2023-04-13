package br.unaerp.contatos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContactListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rvContacts: RecyclerView? = getView()?.findViewById(R.id.rvContacts)
        rvContacts?.layoutManager = LinearLayoutManager(context)
        rvContacts?.adapter = ContactsAdapter(
            listOf("Bruno", "Felipe", "Ana"),
            ::printContact
        )
    }
    private fun printContact(contact: String) {
        Toast.makeText(
            context,
            "Item clicado foi $contact",
            Toast.LENGTH_SHORT
        ).show()
    }
}