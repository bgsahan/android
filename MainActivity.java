public class MainActivity extends AppCompatActivity {

  Button mButton;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity_layout);
    
    mButton = (Button) findViewById(R.id.button);
    
    mButton.setOnClickListener(this);
  }
  
  @Override
  public void onClick(View view) {
    switch(view.getId()) {
      case R.id.button:
        Toast.makeText(getActivity(), "Hello world", Toast.LENGTH_SHORT).show();
        break;
        
      default:
        break;
    }
  }
}
    
