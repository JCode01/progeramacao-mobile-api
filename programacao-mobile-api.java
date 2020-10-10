GET
Javascript Example: let url = 'https://api.sheety.co/e6fb458ed3292df330f6fe924f0caad5/apiCooking/sheet1'; fetch(url)
.then((response) => response.json())
.then(json => {
  // Do something with the data   console.log(json.sheet1S);
});
POST
Add a row to your sheet
Enabled
https://api.sheety.co/e6fb458ed3292df330f6fe924f0caad5/apiCooking/sheet1 Javascript Example
  let url = 'https://api.sheety.co/e6fb458ed3292df330f6fe924f0caad5/apiCooking/sheet1';   let body = { 	sheet1: {
  	...
	}   }   fetch(url, { 	method: 'POST',
	body: JSON.stringify(body)
  })
  .then((response) => response.json())
  .then(json => {
	// Do something with object
    console.log(json.sheet1);
  });
PUT
Edit a row in your sheet
Enabled https://api.sheety.co/e6fb458ed3292df330f6fe924f0caad5/apiCooking/sheet1/[Object ID] Javascript Example
let url = 'https://api.sheety.co/e6fb458ed3292df330f6fe924f0caad5/apiCooking/sheet1/2'; let body = {   sheet1: {
    ...
  } } fetch(url, {   method: 'PUT',
  body: JSON.stringify(body)
})
.then((response) => response.json())
.then(json => {
  // Do something with object   console.log(json.sheet1);
});
DELETE
Delete a row in your sheet
Enabled
https://api.sheety.co/e6fb458ed3292df330f6fe924f0caad5/apiCooking/sheet1/[Object ID] Javascript Example
let url = 'https://api.sheety.co/e6fb458ed3292df330f6fe924f0caad5/apiCooking/sheet1/2'; fetch(url, {   method: 'DELETE',
})
.then((response) => response.json())
.then(() => {
  console.log('Object deleted');
});
 
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android" 	xmlns:app="http://schemas.android.com/apk/res-auto"     xmlns:tools="http://schemas.android.com/tools"     android:layout_height="match_parent"     android:orientation="vertical" 	android:padding="50dp"     android:layout_width="match_parent"
	tools:context="br.com.matheuscastiglioni.blog.requisicao_http.MainActivity">
 
    <EditText
        android:digits="0123456789"         android:layout_height="wrap_content"     	android:hint="CEP"         android:id="@+id/etMain_cep"     	android:textColor="#595959"     	android:textSize="25sp"     	android:inputType="number"
        android:layout_width="match_parent"/>
 
    <LinearLayout         android:gravity="center"         android:layout_height="wrap_content"     	android:orientation="horizontal"
        android:layout_width="match_parent">
 
        <Button
            android:background="@color/colorPrimary"             android:layout_height="wrap_content"         	android:id="@+id/btnMain_buscarCep"         	android:layout_marginBottom="10dp"             android:padding="10dp"         	android:text="Buscar CEP"         	android:textColor="#FDFDFD"         	android:textSize="22sp"
            android:layout_width="wrap_content"/>
 
    </LinearLayout>
 
	<TextView         android:layout_height="match_parent"         android:id="@+id/etMain_resposta"     	android:textColor="#595959"     	android:textSize="20sp"
        android:layout_width="match_parent"/>
 
</LinearLayout>
