Feature: Invader Quotes

  Scenario: Invader Zim quotes by Name
    Given an Invader named "Zim"
    And the Invader "Zim" says "The Earth is safe! I did it, GIR! Now let's go destroy it!"
    When a Quote is requested for "Zim"
    Then we are taken to the Quote Page
    And we see "The Earth is safe! I did it, GIR! Now let's go destroy it!"

  Scenario: Invader GIR quotes by Name
    Given an Invader named "GIR"
    And the Invader "GIR" says "Can I be a mongoose dog?"
    When a Quote is requested for "GIR"
    Then we are taken to the Quote Page
    And we see "Can I be a mongoose dog?"
